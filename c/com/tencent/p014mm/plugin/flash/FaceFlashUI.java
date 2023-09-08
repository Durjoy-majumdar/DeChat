package com.tencent.p014mm.plugin.flash;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import au1.C0222b;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FaceFlashStateEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kj2.C117407d;
import org.json.JSONException;
import org.json.JSONObject;
import p182kk.C61104a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.flash.FaceFlashUI */
public class FaceFlashUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public FaceFlashPreviewLayout f18899d;

    /* renamed from: e */
    public FaceFlashProcessLayout f18900e;

    /* renamed from: f */
    public WeImageView f18901f;

    /* renamed from: g */
    public int f18902g = 90004;

    /* renamed from: h */
    public String f18903h = "";

    /* renamed from: i */
    public String f18904i = "";

    /* renamed from: j */
    public long f18905j = Util.currentTicks();

    /* renamed from: n */
    public IListener f18906n;

    /* renamed from: o */
    public IListener f18907o;

    /* renamed from: com.tencent.mm.plugin.flash.FaceFlashUI$a */
    public class C4351a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f18909d;

        public C4351a(Activity activity) {
            this.f18909d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0222b.m173l("msgVerify", "camera or mic 正在被占用");
            C0222b.m163b().f9686B = 1;
            C0222b.m167f(90033);
            this.f18909d.setResult(1, FaceFlashUI.m4536P7(4, 90033, "finish by voip call"));
            this.f18909d.finish();
        }
    }

    public FaceFlashUI() {
        C40008f fVar = C40008f.f107254d;
        this.f18906n = new IListener<VoipEvent>(fVar) {
            {
                this.__eventId = -797557590;
            }

            public boolean callback(IEvent iEvent) {
                if (((VoipEvent) iEvent).f194019d.f194022b != 3) {
                    return false;
                }
                C0222b.m163b().f9686B = 1;
                FaceFlashUI.this.mo5240K7(90030, "finish by voip call");
                return false;
            }
        };
        this.f18907o = new IListener<FaceFlashStateEvent>(this, fVar) {
            {
                this.__eventId = -544026548;
            }

            public boolean callback(IEvent iEvent) {
                FaceFlashStateEvent faceFlashStateEvent = (FaceFlashStateEvent) iEvent;
                if (faceFlashStateEvent == null) {
                    return false;
                }
                faceFlashStateEvent.f9152d.f9153a = true;
                return false;
            }
        };
    }

    /* renamed from: L7 */
    public static boolean m4535L7(Activity activity, Bundle bundle, int i) {
        C4351a aVar = new C4351a(activity);
        if (C61104a.m71652h(activity, true, aVar) || C61104a.m71670z(activity, aVar) || C61104a.m71666v(activity, aVar) || C61104a.m71650f(activity, aVar) || C61104a.m71655k(activity, aVar)) {
            return false;
        }
        Intent intent = new Intent(activity, FaceFlashUI.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        aVar2.mo10233c(intent);
        C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/flash/FaceFlashUI", "jumpToFaceFlashUI", "(Landroid/app/Activity;Landroid/os/Bundle;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    /* renamed from: P7 */
    public static Intent m4536P7(int i, int i2, String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("err_type", i);
        bundle.putInt("err_code", i2);
        bundle.putString("err_msg", str);
        Log.m105925i("MicroMsg.FaceFlashManager", "face result errorType:%s errorCode:%s errorMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: H7 */
    public void mo5237H7() {
        if (!TextUtils.isEmpty(this.f18904i)) {
            try {
                mo5239J7(new JSONObject(this.f18904i));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FaceFlashManager", e, "", new Object[0]);
            }
        } else {
            Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByCancel", Integer.valueOf(hashCode()));
            Intent P7 = m4536P7(1, this.f18902g, "cancel");
            P7.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
            P7.putExtra("totalTime", Util.ticksToNow(this.f18905j));
            try {
                if (!TextUtils.isEmpty(this.f18903h)) {
                    JSONObject jSONObject = new JSONObject(this.f18903h);
                    P7.putExtra("serial_id", jSONObject.optString("serial_id"));
                    mo5238I7(jSONObject);
                    return;
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.FaceFlashManager", e2, "", new Object[0]);
            }
            C0222b.m172k("usrCancel");
            C0222b.m162a(false);
            C0222b.m163b().f9686B = 6;
            C0222b.m167f(90004);
            setResult(0, P7);
            finish();
        }
    }

    /* renamed from: I7 */
    public void mo5238I7(JSONObject jSONObject) {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByFailed", Integer.valueOf(hashCode()));
        this.f18899d.f18872u.mo14857d();
        C0222b.m162a(false);
        Intent intent = new Intent();
        intent.putExtras(C0381a.m324a(jSONObject));
        setResult(1, intent);
        finish();
    }

    /* renamed from: J7 */
    public void mo5239J7(JSONObject jSONObject) {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishBySuccess", Integer.valueOf(hashCode()));
        if (!isFinishing() && !isDestroyed()) {
            C0222b.m162a(true);
            Intent intent = new Intent();
            Bundle a = C0381a.m324a(jSONObject);
            a.putString("click_other_verify_btn", "no");
            a.putLong("totalTime", Util.ticksToNow(this.f18905j));
            intent.putExtras(a);
            setResult(-1, intent);
            finish();
        }
    }

    /* renamed from: K7 */
    public void mo5240K7(int i, String str) {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finishByUnexpectedError", Integer.valueOf(hashCode()));
        C0222b.m173l("msgVerify", str);
        C0222b.m167f(i);
        C0222b.m162a(false);
        setResult(1, m4536P7(4, i, str));
        finish();
    }

    /* renamed from: M7 */
    public void mo5241M7() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity reset", Integer.valueOf(hashCode()));
        C0222b.m172k("reset");
        C0222b.m163b().f9701q = System.currentTimeMillis();
        mo5242N7(C76577a.m92153d(getContext(), C0966R.color.f3131gg));
        this.f18903h = "";
        this.f18904i = "";
        FaceFlashPreviewLayout faceFlashPreviewLayout = this.f18899d;
        faceFlashPreviewLayout.getClass();
        Log.m105924i("MicroMsg.FaceFlashManager", "reset");
        faceFlashPreviewLayout.f18848A = 0;
        faceFlashPreviewLayout.f18857J.cancel();
        faceFlashPreviewLayout.f18857J.start();
        faceFlashPreviewLayout.f18854G = false;
        C0222b.m175n(12);
        C0222b.m163b().f9699o = 1;
        C0222b.m163b().f9689e = (long) faceFlashPreviewLayout.f18850C;
        faceFlashPreviewLayout.mo5210a();
        if (!faceFlashPreviewLayout.f18873v.isShowing() && ((((System.currentTimeMillis() - faceFlashPreviewLayout.f18856I) / 1000) / 60) / 60) / 24 >= 30) {
            long currentTimeMillis = System.currentTimeMillis();
            faceFlashPreviewLayout.f18856I = currentTimeMillis;
            faceFlashPreviewLayout.f18855H.encode("show-dialog", currentTimeMillis);
            faceFlashPreviewLayout.f18873v.show();
        }
        this.f18899d.setVisibility(0);
        this.f18899d.mo5213c();
        this.f18900e.setVisibility(8);
        C0222b.m165d().f9674j++;
    }

    /* renamed from: N7 */
    public void mo5242N7(int i) {
        this.f18901f.setIconColor(i);
    }

    /* renamed from: O7 */
    public void mo5243O7(String str) {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity showFailedLayout", Integer.valueOf(hashCode()));
        FaceFlashPreviewLayout faceFlashPreviewLayout = this.f18899d;
        if (faceFlashPreviewLayout.f18873v.isShowing()) {
            faceFlashPreviewLayout.f18873v.dismiss();
        }
        this.f18903h = str;
        mo5242N7(C76577a.m92153d(getContext(), C0966R.color.f3133gi));
        this.f18899d.setVisibility(8);
        this.f18899d.mo5211b();
        this.f18900e.setVisibility(0);
        FaceFlashProcessLayout faceFlashProcessLayout = this.f18900e;
        faceFlashProcessLayout.getClass();
        Log.m105924i("MicroMsg.FaceFlashManager", "showFailedAnimation");
        faceFlashProcessLayout.findViewById(C0966R.C0970id.ija).setPadding(0, C75044y4.m89989a(faceFlashProcessLayout.getContext()), 0, 0);
        try {
            faceFlashProcessLayout.f18893h.setImageResource(C0966R.C0969drawable.f4962sj);
            faceFlashProcessLayout.f18893h.startAnimation(faceFlashProcessLayout.f18896n);
            faceFlashProcessLayout.f18892g.setImageDrawable(C76577a.m92158i(faceFlashProcessLayout.getContext(), C0966R.raw.icons_filled_error3));
            faceFlashProcessLayout.f18892g.startAnimation(faceFlashProcessLayout.f18898p);
            if (WeChatEnvironment.isCoolassistEnv() || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) {
                faceFlashProcessLayout.f18892g.setOnLongClickListener(new C4385c(faceFlashProcessLayout));
            }
            JSONObject jSONObject = new JSONObject(str);
            TextView textView = faceFlashProcessLayout.f18890e;
            String q = C76577a.m92166q(faceFlashProcessLayout.getContext(), C0966R.string.ci8);
            String optString = jSONObject.optString("err_msg", jSONObject.optString("errormsg", q));
            if (TextUtils.isEmpty(optString)) {
                C0222b.m173l("msgVerify", q);
            } else {
                C0222b.m173l("msgVerify", optString);
                q = optString;
            }
            textView.setText(q);
            TextView textView2 = faceFlashProcessLayout.f18891f;
            String optString2 = jSONObject.optString("err_tip", "");
            if (TextUtils.isEmpty(optString2)) {
                optString2 = "";
            }
            textView2.setText(optString2);
            String optString3 = jSONObject.optString("err_feedback", "");
            faceFlashProcessLayout.f18895j.setVisibility(TextUtils.isEmpty(optString3) ? 4 : 0);
            faceFlashProcessLayout.f18895j.setOnClickListener(new C4386d(faceFlashProcessLayout, jSONObject, optString3));
            boolean optBoolean = jSONObject.optBoolean("err_retry", true);
            faceFlashProcessLayout.f18894i.setVisibility(0);
            faceFlashProcessLayout.f18894i.setText(optBoolean ? C76577a.m92166q(faceFlashProcessLayout.getContext(), C0966R.string.ckn) : C76577a.m92166q(faceFlashProcessLayout.getContext(), C0966R.string.ckl));
            faceFlashProcessLayout.f18894i.setOnClickListener(new C4387e(faceFlashProcessLayout, optBoolean, jSONObject));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "parse face failed result error.%s", str);
            faceFlashProcessLayout.f18890e.setText(str);
            faceFlashProcessLayout.f18895j.setVisibility(4);
            faceFlashProcessLayout.f18894i.setVisibility(0);
            faceFlashProcessLayout.f18894i.setText(C76577a.m92166q(faceFlashProcessLayout.getContext(), C0966R.string.ckn));
            faceFlashProcessLayout.f18894i.setOnClickListener(new C4388f(faceFlashProcessLayout));
        }
        C0222b.m168g(str);
    }

    public void finish() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity finish", Integer.valueOf(hashCode()));
        ((C119157j) C119157j.f356862d).mo183895z(new C4391j(this));
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a5m;
    }

    public void onBackPressed() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onBackPressed", Integer.valueOf(hashCode()));
        mo5237H7();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/FaceFlashUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.e_t) {
            mo5237H7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/FaceFlashUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105925i("MicroMsg.FaceFlashManager", "screen orientation %d", Integer.valueOf(configuration.orientation));
        this.f18899d.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onCreate", Integer.valueOf(hashCode()));
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            C0222b.m165d().f9668d = System.currentTimeMillis();
            FaceDetectInterfaceCalledResultStruct d = C0222b.m165d();
            d.f9669e = d.mo86045b("functionName", intent.getStringExtra("key_function_name"), true);
            C0222b.m165d().f9670f = (long) intent.getIntExtra("key_business_type", -1);
            FaceDetectInterfaceCalledResultStruct d2 = C0222b.m165d();
            d2.f9671g = d2.mo86045b("appId", intent.getStringExtra("appId"), true);
            C0222b.m165d().f9674j = 1;
            C0222b.m165d().f9675k = intent.getLongExtra("confirm_page_timestamp", -1);
            C0222b.m165d().f9676l = System.currentTimeMillis();
            C0222b.m165d().f9679o = (long) intent.getIntExtra("check_alive_type", -1);
        }
        C0222b.m172k("enter");
        C0222b.m163b().f9701q = System.currentTimeMillis();
        getController().mo177059O0(this, C76577a.m92153d(getContext(), C0966R.color.al6));
        this.f18899d = (FaceFlashPreviewLayout) findViewById(C0966R.C0970id.e_w);
        this.f18900e = (FaceFlashProcessLayout) findViewById(C0966R.C0970id.e_x);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.e_t);
        this.f18901f = weImageView;
        weImageView.setOnClickListener(this);
        this.f18906n.alive();
        this.f18907o.alive();
        C117407d.INSTANCE.idkeyStat(1484, 1, 1, false);
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onDestroy", Integer.valueOf(hashCode()));
        ((C119157j) C119157j.f356862d).mo183895z(new C4391j(this));
        super.onDestroy();
    }

    public void onPause() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onPause", Integer.valueOf(hashCode()));
        super.onPause();
        YtSDKKitFramework.getInstance().doPause();
        this.f18899d.mo5211b();
    }

    public void onResume() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onResume", Integer.valueOf(hashCode()));
        super.onResume();
        YtSDKKitFramework.getInstance().doResume();
        this.f18899d.mo5213c();
    }

    public void onSwipeBack() {
        Log.m105924i("MicroMsg.FaceFlashManager", "onSwipeBack");
        mo5237H7();
        super.onSwipeBack();
    }
}
