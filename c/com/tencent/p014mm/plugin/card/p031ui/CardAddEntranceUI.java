package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.AddCardToWXCardPackage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import hz0.C46144e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C88989a;
import p763ym.C79138l;
import te3.C51854wn;
import wz0.C53260j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardAddEntranceUI */
public class CardAddEntranceUI extends MMActivity {

    /* renamed from: d */
    public LinkedList<C51854wn> f109751d = new LinkedList<>();

    /* renamed from: e */
    public String f109752e = "";

    /* renamed from: f */
    public String f109753f;

    /* renamed from: g */
    public String f109754g;

    /* renamed from: h */
    public int f109755h = 8;

    /* renamed from: i */
    public int f109756i = 0;

    /* renamed from: H7 */
    public final void mo63776H7(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("_wxapi_add_card_to_wx_card_list", str);
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(this.f109753f);
        AddCardToWXCardPackage.Resp resp = new AddCardToWXCardPackage.Resp(bundle);
        if (appInfo != null) {
            resp.openId = appInfo.field_openId;
        }
        String str2 = this.f109754g;
        resp.transaction = str2;
        Object[] objArr = new Object[4];
        objArr[0] = this.f109753f;
        String str3 = "null appinfo";
        objArr[1] = appInfo == null ? str3 : appInfo.field_appName;
        if (appInfo != null) {
            str3 = appInfo.field_openId;
        }
        objArr[2] = str3;
        objArr[3] = str2;
        Log.m105925i("MicroMsg.CardAddEntranceUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", objArr);
        resp.toBundle(bundle);
        Log.m105924i("MicroMsg.CardAddEntranceUI", "setResultToSDK result:" + i);
        if (i == -1) {
            resp.errCode = 0;
        } else {
            resp.errCode = -2;
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = this.f109752e;
        args.bundle = bundle;
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6689lu;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105926v("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onActivityResult");
        if (i2 == -1) {
            Log.m105924i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_OK");
        } else {
            Log.m105924i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI RESULT_CANCELED");
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C51854wn> it = this.f109751d.iterator();
        while (it.hasNext()) {
            C51854wn next = it.next();
            C46144e eVar = new C46144e();
            eVar.f144151d = next.f144151d;
            eVar.f144152e = next.f144152e;
            linkedList.add(eVar);
        }
        if (i == 1) {
            Log.m105924i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_DETAIL");
            int i3 = this.f109755h;
            if (i3 == 7 || i3 == 16) {
                Intent intent2 = new Intent();
                if (i2 == -1) {
                    if (intent != null && linkedList.size() > 0) {
                        ((C46144e) linkedList.get(0)).f124354f = intent.getStringExtra("key_code");
                    }
                    intent2.putExtra("card_list", C53260j.m59692b(linkedList, true, this.f109755h));
                    setResult(-1, intent2);
                } else if (i2 == 0) {
                    intent2.putExtra("card_list", C53260j.m59692b(linkedList, false, this.f109755h));
                    setResult(0, intent2);
                }
            } else if (i3 == 26) {
                Intent intent3 = new Intent();
                if (i2 == -1) {
                    if (intent != null && linkedList.size() > 0) {
                        ((C46144e) linkedList.get(0)).f124354f = intent.getStringExtra("key_code");
                    }
                    intent3.putExtra("card_list", C53260j.m59692b(linkedList, true, this.f109755h));
                    setResult(-1, intent3);
                } else if (i2 == 0) {
                    intent3.putExtra("card_list", C53260j.m59692b(linkedList, false, this.f109755h));
                    setResult(0, intent3);
                }
            } else if (i2 == -1) {
                if (intent != null && linkedList.size() > 0) {
                    ((C46144e) linkedList.get(0)).f124354f = intent.getStringExtra("key_code");
                }
                mo63776H7(-1, C53260j.m59692b(linkedList, true, this.f109755h));
            } else if (i2 == 0) {
                mo63776H7(0, C53260j.m59692b(linkedList, false, i3));
            }
        } else if (i == 2) {
            Log.m105924i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI REQUEST_CARD_ACCEPT_CARD_LIST");
            String stringExtra = intent != null ? intent.getStringExtra("card_list") : "";
            int i4 = this.f109755h;
            if (i4 == 7 || i4 == 16) {
                Intent intent4 = new Intent();
                if (i2 != -1) {
                    if (i2 == 0) {
                        if (intent == null || TextUtils.isEmpty(stringExtra)) {
                            intent4.putExtra("card_list", C53260j.m59692b(linkedList, false, this.f109755h));
                            intent4.putExtra("result_code", 1);
                            setResult(0, intent4);
                        } else {
                            intent.putExtra("card_list", C53260j.m59693c(stringExtra, this.f109755h));
                            setResult(0, intent);
                        }
                    }
                } else if (intent == null || TextUtils.isEmpty(stringExtra)) {
                    intent4.putExtra("card_list", C53260j.m59692b(linkedList, true, this.f109755h));
                    setResult(-1, intent4);
                } else {
                    intent.putExtra("card_list", C53260j.m59693c(stringExtra, this.f109755h));
                    setResult(-1, intent);
                }
            } else if (i4 == 26) {
                Intent intent5 = new Intent();
                if (i2 != -1) {
                    if (i2 == 0) {
                        if (intent == null || TextUtils.isEmpty(stringExtra)) {
                            intent5.putExtra("card_list", C53260j.m59692b(linkedList, false, this.f109755h));
                            intent5.putExtra("result_code", 1);
                            setResult(0, intent5);
                        } else {
                            intent.putExtra("card_list", C53260j.m59693c(stringExtra, this.f109755h));
                            setResult(0, intent);
                        }
                    }
                } else if (intent == null || TextUtils.isEmpty(stringExtra)) {
                    intent5.putExtra("card_list", C53260j.m59692b(linkedList, true, this.f109755h));
                    setResult(-1, intent5);
                } else {
                    intent.putExtra("card_list", C53260j.m59693c(stringExtra, this.f109755h));
                    setResult(-1, intent);
                }
            } else if (i2 != -1) {
                if (i2 == 0) {
                    if (!TextUtils.isEmpty(stringExtra)) {
                        mo63776H7(0, stringExtra);
                    } else {
                        mo63776H7(0, C53260j.m59692b(linkedList, false, this.f109755h));
                    }
                }
            } else if (!TextUtils.isEmpty(stringExtra)) {
                mo63776H7(-1, stringExtra);
            } else {
                mo63776H7(-1, C53260j.m59692b(linkedList, true, this.f109755h));
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI onCreate() intent == null");
            setResult(0);
            finish();
            return;
        }
        Log.m105924i("MicroMsg.CardAddEntranceUI", "CardAddEntranceUI doRediect() handle data");
        String stringExtra = intent.getStringExtra("key_in_card_list");
        this.f109755h = intent.getIntExtra("key_from_scene", 8);
        this.f109756i = intent.getIntExtra("key_stastic_scene", 0);
        Log.m105924i("MicroMsg.CardAddEntranceUI", "doRediect() from_scene:" + this.f109755h + "  from_origin_scene:" + this.f109756i);
        this.f109752e = intent.getStringExtra("key_package_name");
        String stringExtra2 = intent.getStringExtra("key_sign");
        String stringExtra3 = getIntent().getStringExtra("src_username");
        Log.m105924i("MicroMsg.CardAddEntranceUI", "doRediect() src_username:" + stringExtra3);
        String stringExtra4 = getIntent().getStringExtra("js_url");
        this.f109753f = getIntent().getStringExtra("key_app_id");
        this.f109754g = getIntent().getStringExtra("key_transaction");
        String stringExtra5 = getIntent().getStringExtra("key_consumed_card_id");
        String str = "key_sign";
        StringBuilder sb = new StringBuilder();
        String str2 = stringExtra2;
        sb.append("doRediect() consumedCardId:");
        sb.append(stringExtra5);
        Log.m105924i("MicroMsg.CardAddEntranceUI", sb.toString());
        String stringExtra6 = getIntent().getStringExtra("key_template_id");
        String str3 = "MicroMsg.CardAddEntranceUI";
        ArrayList<C51854wn> a = C53260j.m59691a(stringExtra, this.f109755h);
        if (a == null || a.size() == 0) {
            Log.m105920e(str3, "CardAddEntranceUI initView () tempList == null || tempList.size() == 0");
            setResult(0);
            finish();
            return;
        }
        String str4 = "key_package_name";
        this.f109751d.clear();
        this.f109751d.addAll(a);
        Intent intent2 = new Intent();
        String str5 = "key_in_card_list";
        intent2.putExtra("key_from_scene", this.f109755h);
        intent2.putExtra("key_stastic_scene", this.f109756i);
        if (a.size() == 1) {
            C51854wn wnVar = a.get(0);
            intent2.putExtra("key_card_id", wnVar.f144151d);
            intent2.putExtra("key_card_ext", wnVar.f144152e);
            intent2.putExtra("src_username", stringExtra3);
            intent2.putExtra("js_url", stringExtra4);
            intent2.putExtra("key_consumed_card_id", stringExtra5);
            intent2.putExtra("key_template_id", stringExtra6);
            intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent2.setClass(this, CardDetailUI.class);
            startActivityForResult(intent2, 1);
            return;
        }
        intent2.putExtra(str5, stringExtra);
        intent2.putExtra(str4, this.f109752e);
        intent2.putExtra(str, str2);
        intent2.putExtra("src_username", stringExtra3);
        intent2.putExtra("js_url", stringExtra4);
        intent2.putExtra("key_consumed_card_id", stringExtra5);
        intent2.putExtra("key_template_id", stringExtra6);
        intent2.setClass(this, CardAcceptCardListUI.class);
        startActivityForResult(intent2, 2);
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
