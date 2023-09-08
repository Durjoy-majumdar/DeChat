package p61;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C93104c0;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2RewardUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C96984r2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import j61.C46445t;
import j61.C98905c;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p214om.C11502f;
import te3.C101824o80;
import u61.C101963g;
import u61.C101966i;
import u61.C14123e;
import x51.C102561f;
import x51.C102562g;

/* renamed from: p61.r */
public class C100671r {

    /* renamed from: n */
    public static C101966i f294942n = new C101966i(2003);

    /* renamed from: a */
    public boolean f294943a = false;

    /* renamed from: b */
    public Context f294944b = MMApplicationContext.getContext();

    /* renamed from: c */
    public Context f294945c;

    /* renamed from: d */
    public C100642b0 f294946d;

    /* renamed from: e */
    public C93104c0 f294947e;

    /* renamed from: f */
    public int f294948f;

    /* renamed from: g */
    public long f294949g = 0;

    /* renamed from: h */
    public String f294950h = "";

    /* renamed from: i */
    public C100673b f294951i;

    /* renamed from: j */
    public String f294952j;

    /* renamed from: k */
    public C101824o80 f294953k;

    /* renamed from: l */
    public String f294954l;

    /* renamed from: m */
    public EmoticonStoreActionStruct f294955m;

    /* renamed from: p61.r$a */
    public class C100672a implements DialogInterface.OnClickListener {
        public C100672a(C100671r rVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: p61.r$b */
    public interface C100673b {
        /* renamed from: c0 */
        void mo127894c0(String str, String str2, String str3, String str4, String str5);

        /* renamed from: y */
        void mo127895y();
    }

    /* renamed from: a */
    public void mo140108a(int i, int i2, Intent intent) {
        String str;
        int i3;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        Log.m105918d("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "onActivityResult . requestCode:" + i4 + "  resultCode:" + i5);
        if (intent2 != null) {
            i3 = intent2.getIntExtra("key_err_code", 0);
            Log.m105928w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "errCode:" + i3);
            str = intent2.getStringExtra("key_err_msg");
            Log.m105928w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "errMsg:" + str);
        } else {
            str = "";
            i3 = 0;
        }
        this.f294943a = false;
        if (i5 != -1) {
            if (i4 != 2001) {
                return;
            }
            if (C75592q0.m90796z()) {
                C115669n.INSTANCE.idkeyStat(166, 6, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(166, 2, 1, false);
            }
        } else if (i4 != 2001) {
            if (i4 != 2003) {
                Log.m105920e("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "onActivityResult unknow request");
                return;
            }
            C101966i iVar = f294942n;
            String str2 = iVar.f300172a;
            if (!Util.isNullOrNil(str2)) {
                Activity activity = (Activity) this.f294945c;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("Select_Conv_User");
                    if (Util.isNullOrNil(stringExtra)) {
                        Log.m105918d("MicroMsg.emoji.UseSmileyTool", "talker name is invalid so can't go to chat room use.");
                    } else {
                        Intent intent3 = new Intent();
                        intent3.putExtra("Chat_User", stringExtra);
                        intent3.putExtra("smiley_product_id", str2);
                        if (iVar.f300173b) {
                            intent3.addFlags(268435456);
                        }
                        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent3, activity);
                    }
                }
                C115669n.INSTANCE.mo160131h(12069, 3, str2);
            }
        } else if (intent2 != null && i3 == 0) {
            ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_response_product_ids");
            ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("key_response_series_ids");
            int size = stringArrayListExtra.size();
            boolean z = false;
            for (int i6 = 0; i6 < size; i6++) {
                String str3 = stringArrayListExtra.get(i6);
                String str4 = stringArrayListExtra2.get(i6);
                if (this.f294952j.equals(str3)) {
                    C101824o80 o802 = this.f294953k;
                    if (o802 != null) {
                        String str5 = o802.f299006s;
                        String str6 = o802.f298996f;
                        String str7 = o802.f298995e;
                        C100673b bVar = this.f294951i;
                        if (bVar != null) {
                            bVar.mo127894c0(str3, str4, str6, str7, str5);
                        }
                    }
                    this.f294946d.mo140085a(0, this.f294952j);
                    C76879j.m92726T(this.f294945c, str);
                    Log.m105925i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str3);
                    if (stringArrayListExtra.size() > 1) {
                        Log.m105924i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "some other product verify.");
                        C100673b bVar2 = this.f294951i;
                        if (bVar2 != null) {
                            bVar2.mo127895y();
                        }
                    }
                    z = true;
                } else {
                    this.f294946d.mo140085a(5, this.f294952j);
                }
            }
            if (!z) {
                mo140110c(str);
            }
            if (C75592q0.m90796z()) {
                C115669n.INSTANCE.idkeyStat(166, 4, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(166, 0, 1, false);
            }
        } else if (intent2 != null && i3 == 100000002) {
            C101824o80 o803 = this.f294953k;
            if (o803 != null) {
                String str8 = o803.f299006s;
                String str9 = this.f294952j;
                String str10 = this.f294946d.mo140087d().f301983b.f298996f;
                String str11 = this.f294953k.f298995e;
                C100673b bVar3 = this.f294951i;
                if (bVar3 != null) {
                    bVar3.mo127894c0(str9, (String) null, str10, str11, str8);
                }
                this.f294946d.mo140085a(0, this.f294952j);
            }
            Log.m105925i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "emoji has paied. now doScene ExchangeEmotionPackNetScene productId:%s", this.f294952j);
            mo140110c(str);
            if (C75592q0.m90796z()) {
                C115669n.INSTANCE.idkeyStat(166, 7, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(166, 3, 1, false);
            }
        } else if (intent2 == null || i3 != 1) {
            String str12 = this.f294952j;
            if (str12 != null) {
                this.f294946d.mo140088f(str12);
                this.f294946d.mo140086b();
            }
            mo140110c(str);
            if (C75592q0.m90796z()) {
                C115669n.INSTANCE.idkeyStat(166, 5, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(166, 1, 1, false);
            }
            Log.m105925i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "failed pay emoji. errormsg:%s", str);
        } else {
            if (C75592q0.m90796z()) {
                C115669n.INSTANCE.idkeyStat(166, 6, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(166, 2, 1, false);
            }
            Log.m105924i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "user cancel pay emoji.");
        }
    }

    /* renamed from: b */
    public void mo140109b() {
        C96984r2 b;
        C96984r2 b2;
        String str;
        C100642b0 b0Var = this.f294946d;
        if (b0Var != null && b0Var.mo140087d() != null) {
            C102562g d = this.f294946d.mo140087d();
            if (d != null) {
                this.f294953k = d.f301983b;
            }
            C101824o80 o802 = this.f294953k;
            if (o802 != null) {
                String str2 = o802.f298994d;
                String str3 = o802.f298996f;
                String str4 = o802.f299007t;
                String str5 = o802.f299008u;
                int i = o802.f299001n;
                int i2 = o802.f298991B;
                int i3 = this.f294946d.mo140087d().f301987f;
                this.f294946d.mo140087d().getClass();
                boolean z = C75592q0.m90796z();
                boolean z2 = this.f294946d.mo140087d().f301989h;
                int i4 = 3;
                Object[] objArr = new Object[3];
                objArr[0] = str2;
                objArr[1] = TextUtils.isEmpty(str4) ? "" : str4;
                objArr[2] = Integer.valueOf(i3);
                Log.m105925i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
                this.f294952j = str2;
                if (i3 == -1) {
                    if (!C102561f.m135422b(this.f294953k) && !C102561f.m135425e(this.f294953k) && (z || !TextUtils.isEmpty(this.f294953k.f298999i))) {
                        if (z) {
                            C93104c0 c0Var = this.f294947e;
                            if (c0Var != null && (b = c0Var.mo127610b(str2)) != null) {
                                if (TextUtils.isEmpty(b.f284152g)) {
                                    i4 = b.f284148c;
                                }
                            } else {
                                return;
                            }
                        }
                        i4 = 4;
                    }
                    this.f294946d.mo140085a(i4, str2);
                } else if (i3 != 0) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 != 7) {
                                    switch (i3) {
                                        case 9:
                                            C86709a0.m107529k().f251779b.mo123460f(new C46445t(str2, 2));
                                            return;
                                        case 10:
                                            C93104c0 c0Var2 = this.f294947e;
                                            if (c0Var2 != null && (b2 = c0Var2.mo127610b(str2)) != null) {
                                                switch (b2.f284149d) {
                                                    case 10233:
                                                        str = this.f294944b.getString(C0966R.string.c6n);
                                                        break;
                                                    case 10234:
                                                        str = this.f294944b.getString(C0966R.string.c6b);
                                                        break;
                                                    case 10235:
                                                        str = this.f294944b.getString(C0966R.string.c_u);
                                                        break;
                                                    default:
                                                        str = this.f294944b.getString(C0966R.string.c_z);
                                                        break;
                                                }
                                                C76879j.m92748s(this.f294945c, str, (String) null);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            Log.m105928w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] cannot action when loading.");
                                            return;
                                        case 12:
                                            break;
                                        default:
                                            Log.m105928w("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "[onProductClick] unkonw product status");
                                            return;
                                    }
                                } else if (z2) {
                                    C101966i iVar = f294942n;
                                    iVar.mo141488a((Activity) this.f294945c);
                                    iVar.f300172a = str2;
                                    C115669n.INSTANCE.mo160131h(12069, 1, str2);
                                    return;
                                } else if (this.f294946d.mo140087d().f301991j) {
                                    String str6 = this.f294946d.mo140087d().f301983b.f298994d;
                                    String str7 = this.f294946d.mo140087d().f301983b.f298996f;
                                    String str8 = this.f294954l;
                                    if (this.f294945c != null) {
                                        int i5 = this.f294948f == 9 ? 3 : 4;
                                        Intent intent = new Intent();
                                        intent.setClass(this.f294945c, EmojiStoreV2RewardUI.class);
                                        intent.putExtra("extra_id", str6);
                                        intent.putExtra("extra_name", str7);
                                        intent.putExtra("name", str8);
                                        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f294948f);
                                        intent.putExtra("pageType", i5);
                                        intent.putExtra("searchID", this.f294949g);
                                        Context context = this.f294945c;
                                        C9556a aVar = new C9556a();
                                        aVar.mo10233c(intent);
                                        Context context2 = context;
                                        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3PayOrDownloadComponent", "startRewardUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        context.startActivity((Intent) aVar.mo10231a(0));
                                        C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3PayOrDownloadComponent", "startRewardUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        C115669n.INSTANCE.mo160131h(12738, str6, Integer.valueOf(i5), Integer.valueOf(this.f294948f), 0);
                                        return;
                                    }
                                    Log.m105924i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "start reward ui faild. context is null");
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        if (!this.f294943a) {
                            if ((i & 512) == 512) {
                                if (C14123e.f39524b == -1) {
                                    C14123e.f39524b = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, 0);
                                }
                                if (C14123e.f39524b == 0) {
                                    C14123e.m13458c(true);
                                    C14123e.f39523a.mo13541a(this.f294945c).mo140655A();
                                    return;
                                }
                                C14123e.m13456a(this.f294945c, str2, str5, i2, str4, str3);
                                C14123e.m13458c(true);
                                this.f294943a = true;
                                C115669n.INSTANCE.mo160131h(12066, 2, Integer.valueOf(this.f294948f), "", str2, Long.valueOf(this.f294949g), this.f294950h, Integer.valueOf(EmojiLogic.m117482m(this.f294953k.f298993D)), Integer.valueOf(EmojiLogic.m117484o(this.f294953k.f298993D)), EmojiLogic.m117483n(this.f294953k.f298993D));
                                return;
                            }
                            Intent intent2 = new Intent();
                            intent2.putExtra("key_product_id", str2);
                            Log.m105925i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "onProductClick: price %s, currency %s", str4, str5);
                            if (z) {
                                intent2.putExtra("key_currency_type", str5);
                                intent2.putExtra("key_price", str5 + str4);
                            } else {
                                intent2.putExtra("key_currency_type", str5);
                                intent2.putExtra("key_price", str4);
                            }
                            C88144b.m109795m(this.f294945c, "wallet_index", ".ui.WalletIapUI", intent2, 2001);
                            this.f294943a = true;
                            C115669n.INSTANCE.mo160131h(12066, 2, Integer.valueOf(this.f294948f), "", str2, Long.valueOf(this.f294949g), this.f294950h, Integer.valueOf(EmojiLogic.m117482m(this.f294953k.f298993D)), Integer.valueOf(EmojiLogic.m117484o(this.f294953k.f298993D)), EmojiLogic.m117483n(this.f294953k.f298993D));
                            return;
                        }
                        return;
                    }
                    if (C101963g.m134218c(this.f294953k)) {
                        C98905c.m128727a().mo138241c();
                        return;
                    }
                    C101824o80 o803 = this.f294953k;
                    String str9 = o803.f298995e;
                    String str10 = o803.f299006s;
                    C100673b bVar = this.f294951i;
                    if (bVar != null) {
                        bVar.mo127894c0(str2, (String) null, str3, str9, str10);
                    }
                    this.f294946d.mo140089g(0, str2);
                    Log.m105925i("MicroMsg.emoji.EmojiStoreV3PayOrDownloadComponent", "doScene ExchangeEmotionPackNetScene productId:%s", str2);
                    C115669n.INSTANCE.mo160131h(12066, 0, Integer.valueOf(this.f294948f), "", str2, Long.valueOf(this.f294949g), this.f294950h, Integer.valueOf(EmojiLogic.m117482m(this.f294953k.f298993D)), Integer.valueOf(EmojiLogic.m117484o(this.f294953k.f298993D)), EmojiLogic.m117483n(this.f294953k.f298993D));
                    EmoticonStoreActionStruct emoticonStoreActionStruct = this.f294955m;
                    if (emoticonStoreActionStruct != null) {
                        emoticonStoreActionStruct.f265470f = 2;
                        emoticonStoreActionStruct.mo126618x(this.f294953k.f298994d);
                        this.f294955m.mo126614t(this.f294953k.f298996f);
                        this.f294955m.mo126615u(String.valueOf(EmojiLogic.m117482m(this.f294953k.f298993D)));
                        this.f294955m.mo126617w(String.valueOf(EmojiLogic.m117484o(this.f294953k.f298993D)));
                        this.f294955m.mo126616v(EmojiLogic.m117483n(this.f294953k.f298993D));
                        this.f294955m.mo86054n();
                    }
                } else {
                    this.f294946d.mo140085a(3, str2);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo140110c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f294944b.getString(C0966R.string.c77);
        }
        C76879j.m92749t(this.f294945c, str, "", new C100672a(this));
    }
}
