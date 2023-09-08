package com.tencent.p014mm.plugin.flash.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import au1.C0222b;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FaceFlashStateEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import di3.C86312j;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import kg3.C76577a;
import kj2.C117407d;
import org.json.JSONException;
import org.json.JSONObject;
import xt1.C15896b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionUI */
public class FaceFlashActionUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public FaceFlashActionPreviewLayout f18980d;

    /* renamed from: e */
    public FaceFlashActionProcessLayout f18981e;

    /* renamed from: f */
    public WeImageView f18982f;

    /* renamed from: g */
    public int f18983g = 90004;

    /* renamed from: h */
    public String f18984h = "";

    /* renamed from: i */
    public String f18985i = "";

    /* renamed from: j */
    public long f18986j = Util.currentTicks();

    /* renamed from: n */
    public IListener f18987n;

    /* renamed from: o */
    public IListener f18988o;

    public FaceFlashActionUI() {
        C40008f fVar = C40008f.f107254d;
        this.f18987n = new IListener<VoipEvent>(fVar) {
            {
                this.__eventId = -797557590;
            }

            public boolean callback(IEvent iEvent) {
                if (((VoipEvent) iEvent).f194019d.f194022b != 3) {
                    return false;
                }
                C0222b.m164c().f9724q = 1;
                FaceFlashActionUI.this.mo5274K7(90030, "finish by voip call");
                return false;
            }
        };
        this.f18988o = new IListener<FaceFlashStateEvent>(this, fVar) {
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

    /* renamed from: Q7 */
    public static Intent m4554Q7(int i, int i2, String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("err_type", i);
        bundle.putInt("err_code", i2);
        bundle.putString("err_msg", str);
        Log.m105925i("MicroMsg.FaceFlashActionUI", "face result errorType:%s errorCode:%s errorMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: H7 */
    public void mo5271H7() {
        if (!TextUtils.isEmpty(this.f18985i)) {
            try {
                mo5273J7(new JSONObject(this.f18985i));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FaceFlashActionUI", e, "", new Object[0]);
            }
        } else {
            Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByCancel", Integer.valueOf(hashCode()));
            Intent Q7 = m4554Q7(1, this.f18983g, "cancel");
            Q7.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
            Q7.putExtra("totalTime", Util.ticksToNow(this.f18986j));
            try {
                if (!TextUtils.isEmpty(this.f18984h)) {
                    JSONObject jSONObject = new JSONObject(this.f18984h);
                    Q7.putExtra("serial_id", jSONObject.optString("serial_id"));
                    if (C0381a.m327d(jSONObject)) {
                        Intent intent = ((Activity) this.f18980d.getContext()).getIntent();
                        if (intent != null ? !Util.isNullOrNil(intent.getStringExtra("otherVerifyTitle")) : false) {
                            C115669n.INSTANCE.mo160131h(23269, 1, 2, 1);
                        } else {
                            C115669n.INSTANCE.mo160131h(23269, 1, 2, 0);
                        }
                    }
                    mo5272I7(jSONObject);
                    return;
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.FaceFlashActionUI", e2, "", new Object[0]);
            }
            C0222b.m172k("usrCancel");
            C0222b.m164c().f9724q = 6;
            C0222b.m169h(90004);
            setResult(0, Q7);
            finish();
        }
    }

    /* renamed from: I7 */
    public void mo5272I7(JSONObject jSONObject) {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByFailed", Integer.valueOf(hashCode()));
        Intent intent = new Intent();
        Bundle a = C0381a.m324a(jSONObject);
        a.putString("err_msg", "fail");
        intent.putExtras(a);
        setResult(1, intent);
        finish();
    }

    /* renamed from: J7 */
    public void mo5273J7(JSONObject jSONObject) {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishBySuccess", Integer.valueOf(hashCode()));
        if (!isFinishing() && !isDestroyed()) {
            Intent intent = new Intent();
            Bundle a = C0381a.m324a(jSONObject);
            a.putString("err_msg", "ok");
            a.putString("click_other_verify_btn", "no");
            a.putLong("totalTime", Util.ticksToNow(this.f18986j));
            intent.putExtras(a);
            setResult(-1, intent);
            finish();
        }
    }

    /* renamed from: K7 */
    public void mo5274K7(int i, String str) {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finishByUnexpectedError", Integer.valueOf(hashCode()));
        C0222b.m173l("msgVerify", str);
        C0222b.m169h(i);
        setResult(1, m4554Q7(4, i, "fail"));
        finish();
    }

    /* renamed from: L7 */
    public void mo5275L7(Intent intent) {
        Log.m105924i("MicroMsg.FaceFlashActionUI", "onKindaBackResult");
        if (intent == null) {
            Log.m105924i("MicroMsg.FaceFlashActionUI", "resultData == null");
            mo5271H7();
            return;
        }
        String stringExtra = intent.getStringExtra("error_msg");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105924i("MicroMsg.FaceFlashActionUI", "errorMsg == null");
            mo5271H7();
            return;
        }
        Log.m105925i("MicroMsg.FaceFlashActionUI", "errorMsg：%s", stringExtra);
        stringExtra.getClass();
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case 3548:
                if (stringExtra.equals("ok")) {
                    c = 0;
                    break;
                }
                break;
            case 3135262:
                if (stringExtra.equals("fail")) {
                    c = 1;
                    break;
                }
                break;
            case 108405416:
                if (stringExtra.equals("retry")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                try {
                    mo5273J7(new JSONObject(this.f18985i));
                    return;
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.FaceFlashActionUI", "parse face success result error：%s，successStr：%s", e.toString(), this.f18985i);
                    mo5271H7();
                    return;
                }
            case 1:
                try {
                    JSONObject jSONObject = new JSONObject(this.f18984h);
                    if ("yes".equals(intent.getStringExtra("other_verify_title_state"))) {
                        jSONObject.put("click_other_verify_btn", "yes");
                        if (C0381a.m327d(jSONObject)) {
                            C115669n.INSTANCE.mo160131h(23269, 1, 1, 1);
                        }
                    } else {
                        String optString = jSONObject.optString("otherVerifyTitle");
                        if (C0381a.m327d(jSONObject)) {
                            if (Util.isNullOrNil(optString)) {
                                C115669n.INSTANCE.mo160131h(23269, 1, 3, 1);
                            } else {
                                C115669n.INSTANCE.mo160131h(23269, 1, 3, 0);
                            }
                        }
                    }
                    mo5272I7(jSONObject);
                    return;
                } catch (JSONException e2) {
                    Log.m105921e("MicroMsg.FaceFlashActionUI", "parse face failed result error：%s，failStr：%s", e2.toString(), this.f18984h);
                    mo5271H7();
                    return;
                }
            case 2:
                mo5276M7();
                return;
            default:
                Log.m105920e("MicroMsg.FaceFlashActionUI", "unknown type");
                mo5271H7();
                return;
        }
    }

    /* renamed from: M7 */
    public void mo5276M7() {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity reset", Integer.valueOf(hashCode()));
        C0222b.m172k("reset");
        mo5277N7(C76577a.m92153d(getContext(), C0966R.color.BW_0));
        this.f18984h = "";
        this.f18985i = "";
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f18980d;
        faceFlashActionPreviewLayout.getClass();
        Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "reset");
        faceFlashActionPreviewLayout.f18915C = 0;
        faceFlashActionPreviewLayout.f18925M.cancel();
        faceFlashActionPreviewLayout.f18925M.start();
        faceFlashActionPreviewLayout.f18923K = false;
        faceFlashActionPreviewLayout.mo5247a();
        C0222b.m164c().f9723p = 1;
        C0222b.m164c().f9712e = (long) faceFlashActionPreviewLayout.f18920H;
        this.f18980d.setVisibility(0);
        this.f18981e.setVisibility(8);
    }

    /* renamed from: N7 */
    public void mo5277N7(int i) {
        this.f18982f.setIconColor(i);
    }

    /* renamed from: O7 */
    public void mo5278O7(String str) {
        boolean z = false;
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity showFailedLayout", Integer.valueOf(hashCode()));
        this.f18983g = 90006;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Intent intent = ((Activity) this.f18980d.getContext()).getIntent();
            if (intent != null) {
                z = !Util.isNullOrNil(intent.getStringExtra("otherVerifyTitle"));
            }
            if (z && Util.isNullOrNil(jSONObject.optString("otherVerifyTitle"))) {
                jSONObject.put("otherVerifyTitle", this.f18980d.getFaceOtherVerifyTitle());
                str = jSONObject.toString();
            }
        } catch (JSONException unused) {
        }
        this.f18984h = str;
        ((C119157j) C119157j.f356862d).mo183895z(new FaceFlashActionUI$$b(this));
    }

    /* renamed from: P7 */
    public void mo5279P7(String str) {
        Class cls = C76324c.class;
        this.f18981e.setVisibility(8);
        Log.m105925i("MicroMsg.FaceFlashActionUI", "startKindaFaceCheckUseCase result：%s", str);
        str.getClass();
        if (str.equals("ok")) {
            Intent intent = new Intent();
            intent.putExtra("error_msg", "ok");
            ((C76324c) C86312j.m106911c(cls)).startFaceCheckUseCase("faceCheckResultUseCase", intent, new FaceFlashActionUI$$a(this));
        } else if (!str.equals("fail")) {
            Log.m105920e("MicroMsg.FaceFlashActionUI", "unknown type");
            mo5271H7();
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("error_msg", "fail");
            try {
                JSONObject jSONObject = new JSONObject(this.f18984h);
                intent2.putExtra("error_tips", C0381a.m325b(jSONObject, C76577a.m92166q(getContext(), C0966R.string.ci8)));
                intent2.putExtra("can_retry", jSONObject.optInt("err_retry", 1) == 1);
                intent2.putExtra("other_verify_title", jSONObject.optString("otherVerifyTitle"));
            } catch (JSONException e) {
                mo5271H7();
                Log.m105921e("MicroMsg.FaceFlashActionUI", "parse failed result error：%s，failStr：%s", e.toString(), this.f18984h);
            }
            ((C76324c) C86312j.m106911c(cls)).startFaceCheckUseCase("faceCheckResultUseCase", intent2, new FaceFlashActionUI$$a(this));
        }
        this.f18980d.setVisibility(8);
    }

    public void finish() {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity finish", Integer.valueOf(hashCode()));
        ((C119157j) C119157j.f356862d).mo183895z(new C4381n(this));
        this.f18987n.dead();
        this.f18988o.dead();
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a5j;
    }

    public void onBackPressed() {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onBackPressed", Integer.valueOf(hashCode()));
        mo5271H7();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.e_t) {
            mo5271H7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onCreate", Integer.valueOf(hashCode()));
        C0222b.m172k("enter");
        super.onCreate(bundle);
        getController().mo177059O0(this, C76577a.m92153d(getContext(), C0966R.color.al6));
        this.f18980d = (FaceFlashActionPreviewLayout) findViewById(C0966R.C0970id.e_w);
        this.f18981e = (FaceFlashActionProcessLayout) findViewById(C0966R.C0970id.e_x);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.e_t);
        this.f18982f = weImageView;
        weImageView.setOnClickListener(this);
        this.f18987n.alive();
        this.f18988o.alive();
        C117407d.INSTANCE.idkeyStat(1484, 1, 1, false);
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity onDestroy", Integer.valueOf(hashCode()));
        ((C119157j) C119157j.f356862d).mo183895z(new C4381n(this));
        this.f18987n.dead();
        this.f18988o.dead();
        super.onDestroy();
    }

    public void onPause() {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onPause", Integer.valueOf(hashCode()));
        super.onPause();
        YtSDKKitFramework.getInstance().doPause();
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f18980d;
        faceFlashActionPreviewLayout.f18936q.mo149959h();
        faceFlashActionPreviewLayout.mo5252f();
    }

    public void onResume() {
        Log.m105925i("MicroMsg.FaceFlashActionUI", "[%s]FaceFlashActivity onResume", Integer.valueOf(hashCode()));
        super.onResume();
        YtSDKKitFramework.getInstance().doResume();
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f18980d;
        if (faceFlashActionPreviewLayout.getVisibility() == 0 && !faceFlashActionPreviewLayout.f18936q.f313134k && faceFlashActionPreviewLayout.f18926d != null && faceFlashActionPreviewLayout.f18933n.getVisibility() != 0) {
            faceFlashActionPreviewLayout.f18936q.mo149958g(faceFlashActionPreviewLayout.f18926d, new C4375g(faceFlashActionPreviewLayout));
        }
    }

    public void onSwipeBack() {
        Log.m105924i("MicroMsg.FaceFlashActionUI", "onSwipeBack");
        mo5271H7();
        super.onSwipeBack();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15896b.class);
    }
}
