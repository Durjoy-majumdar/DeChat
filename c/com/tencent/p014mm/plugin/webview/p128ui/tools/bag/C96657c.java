package com.tencent.p014mm.plugin.webview.p128ui.tools.bag;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96656b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.bag.WebViewBag;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import ie3.C87716k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ke3.C88144b;
import kg3.C76577a;
import l93.C10477d;
import l93.C99348a;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C11171e;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.c */
public enum C96657c {
    INSTANCE;
    

    /* renamed from: d */
    public WebViewBag f283098d;

    /* renamed from: e */
    public C96656b f283099e;

    /* renamed from: f */
    public boolean f283100f;

    /* renamed from: g */
    public long f283101g;

    /* renamed from: h */
    public C96661d f283102h;

    /* renamed from: i */
    public LinkedList<C96662e> f283103i;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.c$a */
    public class C96658a implements C96656b.C72600b {
        public C96658a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.c$b */
    public class C96659b implements WebViewBag.C96655b {
        public C96659b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.c$c */
    public class C96660c implements View.OnClickListener {
        public C96660c() {
        }

        public void onClick(View view) {
            Iterator<String> keys;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagMgr$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C96657c cVar = C96657c.this;
            C96661d dVar = cVar.f283102h;
            String str = dVar.f283108b;
            int i = dVar.f283113g;
            Log.m105925i("MicroMsg.WebViewBagMgr", "bag handleClick: url:%s scene:%d", str, Integer.valueOf(i));
            long currentTimeMillis = System.currentTimeMillis();
            long j = cVar.f283101g;
            if (j <= 0 || currentTimeMillis - j >= 500) {
                cVar.f283101g = currentTimeMillis;
                cVar.mo134831e(13);
                if (!Util.isNullOrNil(str)) {
                    Intent intent = new Intent();
                    JSONObject jSONObject = cVar.f283102h.f283114h;
                    int i2 = C10477d.f31711a;
                    if (!(jSONObject == null || (keys = jSONObject.keys()) == null)) {
                        Bundle bundle = new Bundle();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            try {
                                C10477d.C10478a.m10404a(bundle, next, jSONObject.getJSONObject(next));
                            } catch (JSONException unused) {
                            }
                        }
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("from_bag", true);
                    intent.putExtra("from_bag_id", cVar.f283102h.f283107a);
                    intent.putExtra("from_bag_icon", cVar.f283102h.f283109c);
                    if (i == 1) {
                        Log.m105924i("MicroMsg.WebViewBagMgr", "handleClick go jd url");
                        intent.putExtra("useJs", true);
                        intent.putExtra("vertical_scroll", true);
                        intent.putExtra("minimize_secene", 1);
                        intent.putExtra("KPublisherId", "jd_store");
                        C87716k.f253994a = 9;
                    } else if (i == 2) {
                        Log.m105924i("MicroMsg.WebViewBagMgr", "handleClick go game url");
                    }
                    if (i == 3) {
                        Log.m105924i("MicroMsg.WebViewBagMgr", "handleClick luggage");
                        Context context = MMApplicationContext.getContext();
                        if (!Util.isNullOrNil(intent.getStringExtra("rawUrl"))) {
                            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                        }
                    } else {
                        C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    }
                    WebViewBag webViewBag = cVar.f283098d;
                    if (webViewBag != null) {
                        webViewBag.setTouchEnable(false);
                    }
                    cVar.mo134834h(0.0f);
                    cVar.f283102h.f283112f = System.currentTimeMillis();
                    cVar.f283102h.mo134837a();
                    cVar.mo134833g();
                }
            } else {
                Log.m105924i("MicroMsg.WebViewBagMgr", "handleClick twice click too short");
                cVar.f283101g = currentTimeMillis;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/bag/WebViewBagMgr$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.c$d */
    public static final class C96661d {

        /* renamed from: a */
        public String f283107a;

        /* renamed from: b */
        public String f283108b;

        /* renamed from: c */
        public String f283109c;

        /* renamed from: d */
        public int f283110d;

        /* renamed from: e */
        public int f283111e;

        /* renamed from: f */
        public long f283112f;

        /* renamed from: g */
        public int f283113g;

        /* renamed from: h */
        public JSONObject f283114h;

        public C96661d() {
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC, (Object) null);
            Log.m105925i("MicroMsg.WebViewBagMgr", "BagInfo#load %s", str);
            if (Util.isNullOrNil(str)) {
                this.f283107a = null;
                this.f283108b = null;
                this.f283109c = null;
                this.f283111e = (C76577a.m92145A(MMApplicationContext.getContext()) - C99348a.f291333d) - C99348a.f291334e;
                this.f283110d = C99348a.f291332c + MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.atr);
                this.f283114h = new JSONObject();
                Log.m105925i("MicroMsg.WebViewBagMgr", "BAG_INIT_X:%d BAG_INIT_Y:%d", Integer.valueOf(this.f283111e), Integer.valueOf(this.f283110d));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f283108b = jSONObject.getString("url");
                this.f283107a = jSONObject.optString("id", MD5Util.getMD5String(String.format("bagId#%d#%s", new Object[]{Long.valueOf(System.currentTimeMillis()), this.f283108b})));
                this.f283109c = jSONObject.getString("icon");
                this.f283110d = jSONObject.getInt("pos_y");
                this.f283111e = jSONObject.getInt("pos_x");
                this.f283112f = jSONObject.getLong("last_active_time");
                this.f283114h = jSONObject.getJSONObject("extras");
                this.f283113g = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewBagMgr", "BagInfo#load exp:%s", e);
            }
        }

        /* renamed from: a */
        public void mo134837a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", Util.nullAsNil(this.f283107a));
                jSONObject.put("url", Util.nullAsNil(this.f283108b));
                jSONObject.put("icon", Util.nullAsNil(this.f283109c));
                jSONObject.put("pos_y", this.f283110d);
                jSONObject.put("pos_x", this.f283111e);
                jSONObject.put("last_active_time", this.f283112f);
                jSONObject.put("extras", this.f283114h);
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f283113g);
                String jSONObject2 = jSONObject.toString();
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC, jSONObject2);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewBagMgr", "BagInfo#save exp:%s", e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.c$e */
    public interface C96662e {
        /* renamed from: a */
        void mo134838a();
    }

    /* renamed from: a */
    public final void mo134828a() {
        Log.m105924i("MicroMsg.WebViewBagMgr", "attachBag");
        WindowManager windowManager = (WindowManager) MMApplicationContext.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (C11171e.m11046c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = MMApplicationContext.getContext().getPackageName();
        layoutParams.flags = 40;
        layoutParams.gravity = 51;
        int i = C99348a.f291333d;
        layoutParams.width = i;
        layoutParams.height = i;
        C96661d dVar = this.f283102h;
        layoutParams.x = dVar.f283111e;
        layoutParams.y = dVar.f283110d;
        try {
            windowManager.addView(this.f283098d, layoutParams);
            mo134833g();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewBagMgr", "add failed %s", e);
        }
    }

    /* renamed from: b */
    public void mo134829b() {
        Log.m105925i("MicroMsg.WebViewBagMgr", "checkResumeBag mInWebViewUIFromBag:%b", Boolean.valueOf(this.f283100f));
        if (!Util.isNullOrNil(this.f283102h.f283108b) && !this.f283100f) {
            boolean z = System.currentTimeMillis() - this.f283101g > 500;
            if (!z) {
                Log.m105928w("MicroMsg.WebViewBagMgr", "click to fast!!!");
            }
            if (z) {
                WebViewBag webViewBag = this.f283098d;
                if (webViewBag == null || webViewBag.getVisibility() != 0) {
                    mo134835i(false);
                    Log.m105924i("MicroMsg.WebViewBagMgr", "checkResumeBag show bag");
                    return;
                }
                Log.m105924i("MicroMsg.WebViewBagMgr", "already show");
                this.f283098d.setTouchEnable(true);
                return;
            }
        }
        WebViewBag webViewBag2 = this.f283098d;
        if (webViewBag2 != null) {
            webViewBag2.setVisibility(8);
        }
        Log.m105924i("MicroMsg.WebViewBagMgr", "checkResumeBag hide bag");
    }

    /* renamed from: c */
    public void mo134830c() {
        Log.m105925i("MicroMsg.WebViewBagMgr", "clearBag mCurrentUrl:%s", this.f283102h.f283108b);
        WebViewBag webViewBag = this.f283098d;
        if (webViewBag != null) {
            webViewBag.setVisibility(8);
        }
        C96661d dVar = this.f283102h;
        dVar.f283107a = null;
        dVar.f283108b = null;
        dVar.f283109c = null;
        dVar.f283112f = 0;
        dVar.f283113g = 0;
        dVar.f283114h = new JSONObject();
        dVar.mo134837a();
        Log.m105924i("MicroMsg.WebViewBagMgr", "unAttachBag");
        if (this.f283098d != null) {
            try {
                ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).removeView(this.f283098d);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewBagMgr", "remove failed %s", e);
            }
            this.f283098d = null;
        } else {
            Log.m105920e("MicroMsg.WebViewBagMgr", "unAttachBag mBag null");
        }
        C96656b bVar = this.f283099e;
        if (bVar != null) {
            try {
                ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).removeView(bVar.f283087a);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.BagCancelController", "whenBagUnAttach remove failed %s", e2);
            }
            this.f283099e = null;
        }
        Iterator<C96662e> it = this.f283103i.iterator();
        while (it.hasNext()) {
            it.next().mo134838a();
        }
    }

    /* renamed from: e */
    public final void mo134831e(int i) {
        Log.m105927v("MicroMsg.WebViewBagMgr", "kvReport op:%d", Integer.valueOf(i));
        C115669n.INSTANCE.mo160131h(11576, this.f283102h.f283108b, Integer.valueOf(i), 0, Long.valueOf(System.currentTimeMillis() - this.f283102h.f283112f), this.f283102h.f283107a);
    }

    /* renamed from: f */
    public final void mo134832f(String str, int i, String str2, Bundle bundle, boolean z) {
        if (!z || Util.isNullOrNil(this.f283102h.f283107a)) {
            mo134831e(23);
            this.f283102h.f283107a = MD5Util.getMD5String(String.format("bagId#%d#%s", new Object[]{Long.valueOf(System.currentTimeMillis()), this.f283102h.f283108b}));
        }
        C96661d dVar = this.f283102h;
        dVar.f283108b = str;
        dVar.f283109c = str2;
        dVar.f283113g = i;
        dVar.f283112f = Util.nowMilliSecond();
        C96661d dVar2 = this.f283102h;
        int i2 = C10477d.f31711a;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            try {
                for (String next : bundle.keySet()) {
                    jSONObject.put(next, new C10477d.C10478a(bundle.get(next)));
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WebViewBagIntentLogic", "save exp:%s", e);
            }
        }
        dVar2.f283114h = jSONObject;
        this.f283102h.mo134837a();
    }

    /* renamed from: g */
    public final void mo134833g() {
        Log.m105925i("MicroMsg.WebViewBagMgr", "setAngryInfo mBagInfo.lastActiveTime:%d", Long.valueOf(this.f283102h.f283112f));
        if (this.f283098d != null) {
            if ("1".equals((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEBVIEW_BAG_TEST_INFO_STRING_SYNC, "0"))) {
                this.f283098d.mo134812b(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, 100, this.f283102h.f283112f + 2000);
            } else {
                this.f283098d.mo134812b(3600000, 30000, this.f283102h.f283112f + 3600000);
            }
        }
    }

    /* renamed from: h */
    public void mo134834h(float f) {
        WebViewBag webViewBag = this.f283098d;
        if (webViewBag != null) {
            webViewBag.setAlpha(f);
            if (f == 0.0f) {
                this.f283098d.setVisibility(8);
            } else {
                this.f283098d.setVisibility(0);
            }
        }
    }

    /* renamed from: i */
    public final void mo134835i(boolean z) {
        Log.m105925i("MicroMsg.WebViewBagMgr", "showBag url:%s", this.f283102h.f283108b);
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            Log.m105928w("MicroMsg.WebViewBagMgr", "showBag: no float window permission");
        } else if (Util.isNullOrNil(this.f283102h.f283108b)) {
            mo134830c();
        } else {
            WebViewBag webViewBag = this.f283098d;
            boolean z2 = webViewBag == null;
            if (webViewBag == null) {
                this.f283099e = new C96656b(new C96658a());
                WebViewBag webViewBag2 = new WebViewBag(MMApplicationContext.getContext(), (AttributeSet) null);
                this.f283098d = webViewBag2;
                webViewBag2.setListener(new C96659b());
                this.f283098d.setOnClickListener(new C96660c());
            }
            mo134834h(1.0f);
            this.f283098d.setTouchEnable(true);
            this.f283098d.setIcon(this.f283102h.f283109c);
            mo134833g();
            Log.m105925i("MicroMsg.WebViewBagMgr", "bag showed needAttach:%b mCurrentBagId:%s", Boolean.valueOf(z2), this.f283102h.f283107a);
            if (z2) {
                if (z) {
                    this.f283098d.setVisibility(4);
                    mo134828a();
                    this.f283098d.setVisibility(0);
                    this.f283098d.mo134814d();
                    return;
                }
                mo134828a();
            } else if (this.f283098d.getVisibility() != 0) {
                this.f283098d.setVisibility(0);
                if (z) {
                    this.f283098d.mo134814d();
                }
            } else {
                Log.m105924i("MicroMsg.WebViewBagMgr", "already showed");
            }
        }
    }
}
