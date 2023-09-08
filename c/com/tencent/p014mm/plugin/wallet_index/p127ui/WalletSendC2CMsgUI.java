package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ie3.C8883h;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import n63.C76839i;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import v53.C78339d;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletSendC2CMsgUI */
public class WalletSendC2CMsgUI extends WalletBaseUI {

    /* renamed from: d */
    public Map<String, String> f211058d = null;

    /* renamed from: e */
    public int f211059e;

    /* renamed from: H7 */
    public final boolean mo99957H7(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (this.f211059e == 1) {
            String stringExtra = getIntent().getStringExtra("key_receiver");
            String stringExtra2 = getIntent().getStringExtra("key_sender_des");
            String stringExtra3 = getIntent().getStringExtra("key_receiver_des");
            String encode = URLEncoder.encode(getIntent().getStringExtra("key_url"));
            String stringExtra4 = getIntent().getStringExtra("key_templateid");
            str9 = stringExtra;
            str5 = stringExtra2;
            str4 = stringExtra3;
            str3 = encode;
            str6 = stringExtra4;
            str2 = getIntent().getStringExtra("key_sceneid");
            str8 = getIntent().getStringExtra("key_receivertitle");
            str7 = getIntent().getStringExtra("key_sendertitle");
        } else {
            Map<String, String> I7 = mo99958I7();
            if (I7 == null || Util.isNullOrNil(str)) {
                str9 = str;
                str8 = null;
                str7 = null;
                str6 = null;
                str5 = null;
                str4 = null;
                str3 = null;
                str2 = null;
            } else {
                String decode = URLDecoder.decode(Util.nullAsNil(I7.get("receivertitle")));
                String decode2 = URLDecoder.decode(Util.nullAsNil(I7.get("sendertitle")));
                String decode3 = URLDecoder.decode(Util.nullAsNil(I7.get("senderdes")));
                String decode4 = URLDecoder.decode(Util.nullAsNil(I7.get("receiverdes")));
                String nullAsNil = Util.nullAsNil(I7.get("url"));
                String decode5 = URLDecoder.decode(Util.nullAsNil(I7.get("templateid")));
                str9 = str;
                str2 = URLDecoder.decode(Util.nullAsNil(I7.get("senceid")));
                str8 = decode;
                str7 = decode2;
                str5 = decode3;
                str4 = decode4;
                str3 = nullAsNil;
                str6 = decode5;
            }
        }
        if (Util.isNullOrNil(str3) || Util.isNullOrNil(str6)) {
            Log.m105928w("MicroMsg.WalletSendC2CMsgUI", "url = " + Util.isNullOrNil(str3) + "templateId=" + Util.isNullOrNil(str6));
            return false;
        }
        Log.m105918d("MicroMsg.WalletSendC2CMsgUI", "send c2c msg to" + str9);
        doSceneProgress(new C76839i(str9, str8, str7, str6, str5, str4, str3, str2));
        return true;
    }

    /* renamed from: I7 */
    public final Map<String, String> mo99958I7() {
        if (this.f211058d == null) {
            String stringExtra = getIntent().getStringExtra("packageExt");
            Log.m105918d("MicroMsg.WalletSendC2CMsgUI", "func[getPackageData] packageExt: " + stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                String[] split = stringExtra.split("&");
                this.f211058d = new HashMap();
                if (split != null && split.length > 0) {
                    for (int i = 0; i < split.length; i++) {
                        if (!Util.isNullOrNil(split[i])) {
                            String[] split2 = split[i].split("=");
                            if (split2.length == 2 && !Util.isNullOrNil(split2[0])) {
                                this.f211058d.put(split2[0], split2[1]);
                            }
                        }
                    }
                }
            }
        }
        return this.f211058d;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            Log.m105918d("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent.toString());
        } else {
            Log.m105920e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + i + ", resultCode = " + i2 + ", data = null");
        }
        if (i != 1) {
            Log.m105920e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, unknown requestCode = " + i);
        } else if (i2 != -1 || intent == null) {
            Log.m105920e("MicroMsg.WalletSendC2CMsgUI", "cancel select contact fail");
            setResult(0);
            finish();
        } else {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            Log.m105918d("MicroMsg.WalletSendC2CMsgUI", "Select user , " + Util.nullAsNil(stringExtra));
            if (!mo99957H7(stringExtra)) {
                Log.m105920e("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
                setResult(-1000);
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f211059e = getIntent().getIntExtra("key_scene", 0);
        Log.m105924i("MicroMsg.WalletSendC2CMsgUI", "scene:" + this.f211059e);
        if (this.f211059e == 0) {
            addSceneEndListener(580);
            if (getIntent() == null) {
                Log.m105920e("MicroMsg.WalletSendC2CMsgUI", "func[doCheckPayNetscene] intent null");
                setResult(-1000);
                finish();
                return;
            }
            doSceneForceProgress(new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 6, "getSendC2CMessageRequest", getIntent().getIntExtra("pay_channel", 0)));
        } else if (!mo99957H7((String) null)) {
            Log.m105918d("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
            setResult(-1000);
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78339d) {
                Log.m105924i("MicroMsg.WalletSendC2CMsgUI", "Check jsapi suc & Go Select Contact");
                C8883h.f28150a = ((C78339d) yVar).mo108331j1();
                Log.m105924i("MicroMsg.WalletSendC2CMsgUI", "doCallSelectConversationUI");
                Map<String, String> I7 = mo99958I7();
                if (I7 != null && I7.containsKey("togroup") && "0".equals(I7.get("togroup"))) {
                    z = true;
                }
                Intent intent = new Intent();
                int i3 = 3;
                if (z) {
                    i3 = 7;
                }
                intent.putExtra("select_is_ret", true);
                intent.putExtra("Select_Conv_Type", i3);
                C88144b.m109802t(this, ".ui.transmit.SelectConversationUI", intent, 1);
                return true;
            } else if (yVar instanceof C76839i) {
                Log.m105924i("MicroMsg.WalletSendC2CMsgUI", "Send c2c msg suc");
                if (this.f211059e == 1) {
                    C76879j.m92726T(this, getString(C0966R.string.l94));
                } else {
                    C76879j.m92726T(this, getString(C0966R.string.fjh));
                    setResult(-1);
                }
                finish();
                return true;
            }
        } else if (yVar instanceof C78339d) {
            Log.m105920e("MicroMsg.WalletSendC2CMsgUI", "Check jsapi fail");
            setResult(-1000);
            finish();
            return true;
        } else if (yVar instanceof C76839i) {
            if (this.f211059e == 1) {
                C76879j.m92726T(this, str);
            } else {
                setResult(-1000);
            }
            finish();
            return true;
        } else {
            setResult(-1000);
            finish();
        }
        return false;
    }
}
