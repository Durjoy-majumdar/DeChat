package k63;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43310p1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.C43337b;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardBindCardListUI;
import com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardCheckOtherCardUI;
import com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardElementInputUI;
import com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletECardFinishUI;
import com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletOpenECardProxyUI;
import com.tencent.p014mm.plugin.wallet_ecard.p126ui.WalletOpenLqbProxyUI;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75282g;
import cr3.C75296i;
import de3.C75355a0;
import j63.C46446e;
import j63.C46447g;
import j63.C76397d;
import j63.C76399f;
import java.io.IOException;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C47350c;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import te3.C49673h83;
import te3.C50641o63;
import te3.C50797p83;
import te3.C51524uc;
import te3.C52159yr2;
import te3.C64384g40;
import te3.C64398gi2;
import te3.C77975p63;
import te3.C77985q63;
import te3.C77990r9;
import v53.C78358z;
import yq3.C79148e;

/* renamed from: k63.b */
public class C76501b extends C79148e {

    /* renamed from: k63.b$a */
    public class C76502a extends C75282g {
        public C76502a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            String str = objArr[0];
            C76501b.this.f232423c.putString("key_bind_new_card_no", str);
            C76501b.this.f232423c.putString("key_bind_new_card_mobile", objArr[1]);
            this.f221419b.mo95362b(new C78358z("", str, (PayInfo) null), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            C117747y yVar2 = yVar;
            if (yVar2 instanceof C78358z) {
                C78358z zVar = (C78358z) yVar2;
                if (i == 0 && i2 == 0) {
                    Bundle bundle = new Bundle();
                    ElementQuery elementQuery = zVar.f229622e;
                    if (elementQuery == null || !elementQuery.f209513p) {
                        bundle.putBoolean("key_check_other_card_need_input_card_elem", true);
                        C76501b.this.mo91264o(this.f221418a, 0, bundle);
                    } else {
                        String string = C76501b.this.f232423c.getString("key_bind_new_card_no");
                        String string2 = C76501b.this.f232423c.getString("key_bind_new_card_mobile");
                        String str2 = zVar.f229622e.f209516s;
                        C76501b.this.f232423c.putString("key_bind_new_card_bank_type", str2);
                        this.f221419b.mo105624c(Exif.PARSE_EXIF_ERROR_CORRUPT);
                        this.f221419b.mo95362b(new C76399f(C76501b.m91962F(C76501b.this), C76501b.this.mo106735H(), string, string2, str2, C76501b.this.mo106734G(), false, false, 0, ""), true);
                    }
                } else {
                    Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", zVar);
                    C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false);
                }
            } else if (yVar2 instanceof C76399f) {
                this.f221419b.mo105630i(Exif.PARSE_EXIF_ERROR_CORRUPT);
                C76399f fVar = (C76399f) yVar2;
                if (i == 0 && i2 == 0) {
                    C77985q63 q632 = fVar.f223707f;
                    if (q632.f228111d == 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("key_check_other_card_need_input_card_elem", false);
                        C50797p83 p832 = fVar.f223707f.f228117j;
                        if (p832 == null || Util.isNullOrNil(p832.f139636d)) {
                            Log.m105924i("MicroMsg.OpenECardProcess", "need verfiy sms");
                            bundle2.putBoolean("key_need_verify_sms", true);
                            bundle2.putString("key_open_card_bind_token", fVar.f223707f.f228114g);
                            bundle2.putString("key_open_card_verify_msg_desc", fVar.f223707f.f228115h);
                        } else {
                            Log.m105924i("MicroMsg.OpenECardProcess", "no need verify sms");
                            bundle2.putBoolean("key_need_verify_sms", false);
                            try {
                                C76501b.this.f232423c.putByteArray("key_open_card_finish_title", fVar.f223707f.f228117j.toByteArray());
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.OpenECardProcess", e, "", new Object[0]);
                            }
                        }
                        C76501b.this.mo91264o(this.f221418a, 0, bundle2);
                    } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, q632.f228116i)) {
                        int i3 = fVar.f223711j;
                        String str3 = fVar.f223712n;
                        C77985q63 q633 = fVar.f223707f;
                        if (!C76397d.m91816b((WalletBaseUI) this.f221418a, fVar, i3, str3, q633.f228111d, q633.f228112e)) {
                            C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, fVar.f223707f.f228112e, fVar.f223712n, str), "", false);
                        }
                    }
                } else {
                    Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", fVar);
                    C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: k63.b$b */
    public class C76503b extends C75282g {

        /* renamed from: k63.b$b$a */
        public class C76504a implements DialogInterface.OnClickListener {
            public C76504a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76503b bVar = C76503b.this;
                C76501b.this.mo91259f(bVar.f221418a, (Bundle) null);
                C76503b.this.f221418a.finish();
            }
        }

        /* renamed from: k63.b$b$b */
        public class C76505b implements DialogInterface.OnClickListener {
            public C76505b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76503b bVar = C76503b.this;
                C76501b.this.mo91259f(bVar.f221418a, (Bundle) null);
                C76503b.this.f221418a.finish();
            }
        }

        public C76503b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: b */
        public void mo99282b(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
            Bundle bundle = new Bundle();
            bundle.putInt("key_process_result_code", 0);
            C76501b.this.mo91259f(this.f221418a, bundle);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            String str = objArr[0];
            int i = C76501b.this.f232423c.getInt("key_open_scene");
            this.f221419b.mo105624c(1958);
            this.f221419b.mo95362b(new C46447g(C76501b.m91962F(C76501b.this), str, i, (String) null), true);
            C76501b.this.f232423c.putString("key_pwd1", str);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C46447g)) {
                return false;
            }
            this.f221419b.mo105630i(1958);
            C46447g gVar = (C46447g) yVar;
            if (i == 0 && i2 == 0) {
                C50641o63 o632 = gVar.f125121f;
                if (o632.f138982d == 0) {
                    Bundle bundle = new Bundle();
                    C50641o63 o633 = gVar.f125121f;
                    Log.m105925i("MicroMsg.OpenECardProcess", "req_serial: %s, is_reuse_existing_ecard: %s", o633.f138985g, Boolean.valueOf(o633.f138988j));
                    C76501b.this.f232423c.putString("key_req_serial", gVar.f125121f.f138985g);
                    if (gVar.f125121f.f138988j) {
                        bundle.putBoolean("key_is_reuse_existing_ecard", true);
                    }
                    C76501b.this.mo91264o(this.f221418a, 0, bundle);
                } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, o632.f138986h)) {
                    int i3 = gVar.f125122g;
                    String str2 = gVar.f125123h;
                    C50641o63 o634 = gVar.f125121f;
                    if (!C76397d.m91816b((WalletBaseUI) this.f221418a, gVar, i3, str2, o634.f138982d, o634.f138983e)) {
                        C76879j.m92713G(this.f221418a, C76397d.m91815a(this.f221418a, gVar.f125121f.f138983e, gVar.f125123h, str), "", false, new C76504a());
                    }
                }
            } else {
                Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", gVar);
                C76879j.m92713G(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false, new C76505b());
            }
            return true;
        }
    }

    /* renamed from: k63.b$c */
    public class C76506c extends C75282g {

        /* renamed from: k63.b$c$a */
        public class C76507a implements DialogInterface.OnClickListener {
            public C76507a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76506c cVar = C76506c.this;
                C76501b.this.mo91259f(cVar.f221418a, (Bundle) null);
            }
        }

        /* renamed from: k63.b$c$b */
        public class C76508b implements DialogInterface.OnClickListener {
            public C76508b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76506c cVar = C76506c.this;
                C76501b.this.mo91259f(cVar.f221418a, (Bundle) null);
            }
        }

        /* renamed from: k63.b$c$c */
        public class C76509c implements DialogInterface.OnClickListener {
            public C76509c() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76506c cVar = C76506c.this;
                C76501b.this.mo91259f(cVar.f221418a, (Bundle) null);
            }
        }

        /* renamed from: k63.b$c$d */
        public class C76510d implements DialogInterface.OnClickListener {
            public C76510d() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76506c cVar = C76506c.this;
                C76501b.this.mo91259f(cVar.f221418a, (Bundle) null);
            }
        }

        public C76506c(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: b */
        public void mo99282b(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
            Bundle bundle = new Bundle();
            bundle.putInt("key_process_result_code", 0);
            C76501b.this.mo91259f(this.f221418a, bundle);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            if (objArr[0].intValue() == 1) {
                Log.m105924i("MicroMsg.OpenECardProcess", "onNext do ecard auth");
                this.f221419b.mo105624c(1958);
                this.f221419b.mo95362b(new C46447g(C76501b.m91962F(C76501b.this), (String) null, objArr[1].intValue(), objArr[2]), true);
            } else {
                Log.m105924i("MicroMsg.OpenECardProcess", "onNext do ecard open");
                int intValue = objArr[1].intValue();
                this.f221419b.mo105624c(Exif.PARSE_EXIF_ERROR_CORRUPT);
                this.f221419b.mo95362b(new C76399f(C76501b.m91962F(C76501b.this), C76501b.this.mo106735H(), intValue), true);
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            C117747y yVar2 = yVar;
            if (yVar2 instanceof C46447g) {
                this.f221419b.mo105630i(1958);
                C46447g gVar = (C46447g) yVar2;
                if (i == 0 && i2 == 0) {
                    C50641o63 o632 = gVar.f125121f;
                    if (o632.f138982d == 0) {
                        Bundle bundle = new Bundle();
                        Log.m105925i("MicroMsg.OpenECardProcess", "req_serial: %s", gVar.f125121f.f138985g);
                        C76501b.this.f232423c.putString("key_req_serial", gVar.f125121f.f138985g);
                        Log.m105925i("MicroMsg.OpenECardProcess", "authScene.token: %s, is_token_invalid: %s, is_reuse_existing_ecard: %s", null, Boolean.valueOf(gVar.f125121f.f138987i), Boolean.valueOf(gVar.f125121f.f138988j));
                        if (!Util.isNullOrNil((String) null)) {
                            bundle.putBoolean("key_is_token_invalid", gVar.f125121f.f138987i);
                        }
                        if (gVar.f125121f.f138988j) {
                            bundle.putBoolean("key_is_reuse_existing_ecard", true);
                        }
                        bundle.putInt("key_ecard_proxy_action", 1);
                        C76501b.this.mo91264o(this.f221418a, 0, bundle);
                    } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, o632.f138986h)) {
                        int i3 = gVar.f125122g;
                        String str2 = gVar.f125123h;
                        C50641o63 o633 = gVar.f125121f;
                        if (!C76397d.m91816b((WalletBaseUI) this.f221418a, gVar, i3, str2, o633.f138982d, o633.f138983e)) {
                            C76879j.m92713G(this.f221418a, C76397d.m91815a(this.f221418a, gVar.f125121f.f138983e, gVar.f125123h, str), "", false, new C76507a());
                        }
                    }
                } else {
                    Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", gVar);
                    C76879j.m92713G(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false, new C76508b());
                }
                return true;
            } else if (!(yVar2 instanceof C76399f)) {
                return false;
            } else {
                this.f221419b.mo105630i(Exif.PARSE_EXIF_ERROR_CORRUPT);
                C76399f fVar = (C76399f) yVar2;
                if (i == 0 && i2 == 0) {
                    C77985q63 q632 = fVar.f223707f;
                    if (q632.f228111d == 0) {
                        C76501b.this.f232423c.putInt("key_select_card_action", 1);
                        C76501b.this.f232423c.putString("key_bind_card_no", fVar.f223708g);
                        C76501b.this.f232423c.putString("key_bind_mobile_no", fVar.f223709h);
                        C76501b.this.f232423c.putString("key_bind_bank_type", fVar.f223710i);
                        Bundle bundle2 = new Bundle();
                        if (fVar.f223707f.f228117j != null) {
                            Log.m105924i("MicroMsg.OpenECardProcess", "no need verify sms");
                            bundle2.putBoolean("key_need_verify_sms", false);
                            try {
                                C76501b.this.f232423c.putByteArray("key_open_card_finish_title", fVar.f223707f.f228117j.toByteArray());
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.OpenECardProcess", e, "", new Object[0]);
                            }
                        } else {
                            Log.m105924i("MicroMsg.OpenECardProcess", "need verfiy sms");
                            bundle2.putBoolean("key_need_verify_sms", true);
                            bundle2.putString("key_open_card_bind_token", fVar.f223707f.f228114g);
                            bundle2.putString("key_open_card_verify_msg_desc", fVar.f223707f.f228115h);
                        }
                        bundle2.putInt("key_ecard_proxy_action", 2);
                        C76501b.this.mo91264o(this.f221418a, 0, bundle2);
                    } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, q632.f228116i)) {
                        int i4 = fVar.f223711j;
                        String str3 = fVar.f223712n;
                        C77985q63 q633 = fVar.f223707f;
                        if (!C76397d.m91816b((WalletBaseUI) this.f221418a, fVar, i4, str3, q633.f228111d, q633.f228112e)) {
                            C76879j.m92713G(this.f221418a, C76397d.m91815a(this.f221418a, fVar.f223707f.f228112e, fVar.f223712n, str), "", false, new C76509c());
                        }
                    }
                } else {
                    Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", fVar);
                    C76879j.m92713G(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false, new C76510d());
                }
                return true;
            }
        }
    }

    /* renamed from: k63.b$d */
    public class C76511d extends C75282g {

        /* renamed from: c */
        public C77398g f223959c;

        /* renamed from: k63.b$d$a */
        public class C76512a implements C72476y0.C72477a {
            public C76512a() {
            }

            /* renamed from: a */
            public void mo66525a(View view) {
                Log.m105918d("MicroMsg.OpenECardProcess", "click span");
                C76511d.this.f223959c.dismiss();
                MMActivity mMActivity = C76511d.this.f221418a;
                if (mMActivity instanceof WalletECardBindCardListUI) {
                    ((WalletECardBindCardListUI) mMActivity).mo99917H7();
                }
            }
        }

        /* renamed from: k63.b$d$b */
        public class C76513b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ EditText f223962d;

            /* renamed from: e */
            public final /* synthetic */ C76399f f223963e;

            /* renamed from: f */
            public final /* synthetic */ TextView f223964f;

            public C76513b(EditText editText, C76399f fVar, TextView textView) {
                this.f223962d = editText;
                this.f223963e = fVar;
                this.f223964f = textView;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.OpenECardProcess", "click verify btn");
                String obj = this.f223962d.getText().toString();
                if (obj.length() == 11) {
                    C76511d.this.f221419b.mo105624c(Exif.PARSE_EXIF_ERROR_CORRUPT);
                    C77975p63 p632 = (C77975p63) ((C47350c) this.f223963e.getReqResp()).f127055a.f127080a;
                    C76501b.this.f232423c.putInt("key_verify_scene", 2);
                    C76511d.this.f221419b.mo105625d(new C76399f(C76501b.m91962F(C76501b.this), p632.f227981e, p632.f227982f, obj, p632.f227985i, C76501b.this.mo106734G(), true, false, 2, p632.f227990q), true);
                    return;
                }
                C64398gi2 gi22 = new C64398gi2();
                C64384g40 g402 = new C64384g40();
                gi22.f183339f = g402;
                g402.f183273d = C76511d.this.f221418a.getString(C0966R.string.c2t);
                gi22.f183339f.f183274e = "#FA5151";
                C64384g40 g403 = new C64384g40();
                gi22.f183340g = g403;
                g403.f183273d = C76511d.this.f221418a.getString(C0966R.string.c2s);
                gi22.f183340g.f183274e = "#0C4F8E";
                C76511d.this.mo106744g(gi22, this.f223964f);
            }
        }

        /* renamed from: k63.b$d$c */
        public class C76514c implements DialogInterface.OnDismissListener {
            public C76514c() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                Log.m105924i("MicroMsg.OpenECardProcess", "dismiss alert");
                C76511d.this.f223959c = null;
            }
        }

        public C76511d(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C77990r9 r9Var = objArr[0];
            String string = C76501b.this.f232423c.getString("key_req_serial", "");
            if (r9Var == null) {
                Log.m105928w("MicroMsg.OpenECardProcess", "empty bank item");
                return false;
            }
            this.f221419b.mo105624c(Exif.PARSE_EXIF_ERROR_CORRUPT);
            String format = String.format("%s %s(%s)", new Object[]{r9Var.f228154d, r9Var.f228156f, r9Var.f228158h});
            C76501b.this.f232423c.putInt("key_verify_scene", 1);
            this.f221419b.mo105625d(new C76399f(C76501b.m91962F(C76501b.this), string, r9Var.f228159i, r9Var.f228157g, r9Var.f228155e, C76501b.this.mo106734G(), true, false, 1, format), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C76399f)) {
                return false;
            }
            this.f221419b.mo105630i(Exif.PARSE_EXIF_ERROR_CORRUPT);
            C76399f fVar = (C76399f) yVar;
            if (i == 0 && i2 == 0) {
                C77985q63 q632 = fVar.f223707f;
                if (q632.f228111d == 0) {
                    if (q632.f228118n != null) {
                        Log.m105924i("MicroMsg.OpenECardProcess", "show input alert");
                        C64398gi2 gi22 = fVar.f223707f.f228118n;
                        C77398g gVar = this.f223959c;
                        if (gVar == null) {
                            View inflate = View.inflate(this.f221418a, C0966R.C0971layout.a09, (ViewGroup) null);
                            EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.cjk);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.cjl);
                            textView.setClickable(true);
                            textView.setOnTouchListener(new C75355a0(this.f221418a));
                            if (!Util.isNullOrNil(gi22.f183338e)) {
                                editText.setHint(fVar.f223707f.f228118n.f183338e);
                            }
                            MMActivity mMActivity = this.f221418a;
                            C77389a aVar = new C77389a();
                            aVar.f225644a = fVar.f223707f.f228118n.f183337d;
                            aVar.f225631N = 4;
                            aVar.f225627J = inflate;
                            if (!Util.isNullOrNil(gi22.f183342i)) {
                                aVar.f225663t = gi22.f183342i;
                            }
                            if (!Util.isNullOrNil(gi22.f183341h)) {
                                aVar.f225664u = gi22.f183341h;
                            }
                            aVar.f225620C = new C76513b(editText, fVar, textView);
                            aVar.f225641X = false;
                            aVar.f225668y = false;
                            aVar.f225623F = new C76514c();
                            C77398g gVar2 = new C77398g(mMActivity, C0966R.style.a66);
                            gVar2.mo107525e(aVar);
                            this.f223959c = gVar2;
                            mo106744g(gi22, textView);
                            this.f223959c.show();
                        } else {
                            mo106744g(gi22, (TextView) gVar.findViewById(C0966R.C0970id.cjl));
                        }
                    } else {
                        C76501b.this.f232423c.putInt("key_select_card_action", 1);
                        C76501b.this.f232423c.putString("key_bind_card_no", fVar.f223708g);
                        C76501b.this.f232423c.putString("key_bind_mobile_no", fVar.f223709h);
                        C76501b.this.f232423c.putString("key_bind_bank_type", fVar.f223710i);
                        Bundle bundle = new Bundle();
                        if (fVar.f223707f.f228117j != null) {
                            Log.m105924i("MicroMsg.OpenECardProcess", "no need verify sms");
                            bundle.putBoolean("key_need_verify_sms", false);
                            try {
                                C76501b.this.f232423c.putByteArray("key_open_card_finish_title", fVar.f223707f.f228117j.toByteArray());
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.OpenECardProcess", e, "", new Object[0]);
                            }
                        } else {
                            Log.m105924i("MicroMsg.OpenECardProcess", "need verfiy sms");
                            bundle.putBoolean("key_need_verify_sms", true);
                            bundle.putString("key_open_card_bind_token", fVar.f223707f.f228114g);
                            bundle.putString("key_open_card_verify_msg_desc", fVar.f223707f.f228115h);
                        }
                        C76501b.this.mo91264o(this.f221418a, 0, bundle);
                    }
                } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, q632.f228116i)) {
                    int i3 = fVar.f223711j;
                    String str2 = fVar.f223712n;
                    C77985q63 q633 = fVar.f223707f;
                    if (!C76397d.m91816b((WalletBaseUI) this.f221418a, fVar, i3, str2, q633.f228111d, q633.f228112e)) {
                        C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, fVar.f223707f.f228112e, fVar.f223712n, str), "", false);
                    }
                }
            } else {
                Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", fVar);
                C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false);
            }
            return true;
        }

        /* renamed from: g */
        public final void mo106744g(C64398gi2 gi22, TextView textView) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C64384g40 g402 = gi22.f183339f;
            if (g402 != null && !Util.isNullOrNil(g402.f183273d)) {
                spannableStringBuilder.append(gi22.f183339f.f183273d);
                if (!Util.isNullOrNil(gi22.f183339f.f183274e)) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C43423i0.m46931b(gi22.f183339f.f183274e, false)), 0, spannableStringBuilder.length(), 18);
                }
            }
            C64384g40 g403 = gi22.f183340g;
            if (g403 != null && !Util.isNullOrNil(g403.f183273d)) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(gi22.f183340g.f183273d);
                spannableStringBuilder.setSpan(new C72476y0(gi22.f183340g.f183274e, (C72476y0.C72477a) new C76512a()), length, spannableStringBuilder.length(), 18);
            }
            textView.setText(spannableStringBuilder);
        }
    }

    /* renamed from: k63.b$e */
    public class C76515e extends C75282g {
        public C76515e(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            String str = objArr[0].f209516s;
            String string = C76501b.this.f232423c.getString("key_bind_new_card_no");
            String string2 = C76501b.this.f232423c.getString("key_bind_new_card_mobile");
            this.f221419b.mo105624c(Exif.PARSE_EXIF_ERROR_CORRUPT);
            this.f221419b.mo95362b(new C76399f(C76501b.m91962F(C76501b.this), C76501b.this.mo106735H(), string, string2, str, C76501b.this.mo106734G(), false, false, 0, ""), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (!(yVar instanceof C76399f)) {
                return false;
            }
            this.f221419b.mo105630i(Exif.PARSE_EXIF_ERROR_CORRUPT);
            C76399f fVar = (C76399f) yVar;
            if (i == 0 && i2 == 0) {
                C77985q63 q632 = fVar.f223707f;
                if (q632.f228111d == 0) {
                    Bundle bundle = new Bundle();
                    if (fVar.f223707f.f228117j != null) {
                        Log.m105924i("MicroMsg.OpenECardProcess", "no need verify sms");
                        bundle.putBoolean("key_need_verify_sms", false);
                        try {
                            C76501b.this.f232423c.putByteArray("key_open_card_finish_title", fVar.f223707f.f228117j.toByteArray());
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.OpenECardProcess", e, "", new Object[0]);
                        }
                    } else {
                        Log.m105924i("MicroMsg.OpenECardProcess", "need verfiy sms");
                        bundle.putBoolean("key_need_verify_sms", true);
                        bundle.putString("key_open_card_bind_token", fVar.f223707f.f228114g);
                        bundle.putString("key_open_card_verify_msg_desc", fVar.f223707f.f228115h);
                    }
                    C76501b.this.mo91264o(this.f221418a, 0, bundle);
                } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, q632.f228116i)) {
                    int i3 = fVar.f223711j;
                    String str2 = fVar.f223712n;
                    C77985q63 q633 = fVar.f223707f;
                    if (!C76397d.m91816b((WalletBaseUI) this.f221418a, fVar, i3, str2, q633.f228111d, q633.f228112e)) {
                        C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, fVar.f223707f.f228112e, fVar.f223712n, str), "", false);
                    }
                }
            } else {
                Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", fVar);
                C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false);
            }
            return true;
        }
    }

    /* renamed from: k63.b$f */
    public class C76516f extends C75282g {
        public C76516f(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            objArr[0].intValue();
            this.f221419b.mo105624c(2996);
            this.f221419b.mo95362b(new C43310p1(C76501b.m91962F(C76501b.this), objArr[1]), true);
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            C43337b bVar;
            if (!(yVar instanceof C43310p1)) {
                return false;
            }
            Log.m105925i("MicroMsg.OpenECardProcess", "openLqbAccount scene end, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
            C43310p1 p1Var = (C43310p1) yVar;
            Bundle bundle = new Bundle();
            if (i == 0 && i2 == 0) {
                C49673h83 h832 = p1Var.f117146d;
                C52159yr2 yr22 = h832.f134502f;
                if (yr22 != null) {
                    MMActivity mMActivity = this.f221418a;
                    if ((mMActivity instanceof WalletOpenLqbProxyUI) && (bVar = ((WalletOpenLqbProxyUI) mMActivity).f210966d) != null) {
                        bVar.mo67549a(yr22, (C43337b.C43339b) null);
                    }
                }
                if (h832.f134500d == 0) {
                    C76501b.this.f232423c.putBoolean("key_goto_lqt_detail", true);
                    bundle.putInt("key_process_result_code", -1);
                } else if (h832.f134502f == null) {
                    Log.m105925i("MicroMsg.OpenECardProcess", "toast: %s", h832.f134501e);
                    C76701a.makeText((Context) this.f221418a, (CharSequence) h832.f134501e, 1).show();
                }
            } else {
                Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", yVar);
                C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false);
            }
            C76501b.this.mo91259f(this.f221418a, bundle);
            return true;
        }
    }

    /* renamed from: k63.b$g */
    public class C76517g extends C75282g {
        public C76517g(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            return this.f221418a.getIntent().getStringExtra("key_open_card_verify_msg_desc");
        }

        /* renamed from: b */
        public void mo99282b(int i, int i2, Intent intent) {
            Log.m105925i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
            C76501b.this.mo91259f(this.f221418a, new Bundle());
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            String string = C76501b.this.f232423c.getString("key_pwd1");
            String string2 = C76501b.this.f232423c.getString("key_verify_code");
            String H = C76501b.this.mo106735H();
            int i = C76501b.this.f232423c.getInt("key_open_scene");
            C46446e eVar = new C46446e(C76501b.m91962F(C76501b.this), H, string2, this.f221418a.getIntent().getStringExtra("key_open_card_bind_token"), string, i);
            this.f221419b.mo105624c(1986);
            this.f221419b.mo105626e(eVar, true, 3, 0);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            C117747y yVar2 = yVar;
            if (yVar2 instanceof C46446e) {
                this.f221419b.mo105630i(1986);
                C46446e eVar = (C46446e) yVar2;
                if (i == 0 && i2 == 0) {
                    C51524uc ucVar = eVar.f125118f;
                    if (ucVar.f142730d == 0) {
                        Bundle bundle = new Bundle();
                        C50797p83 p832 = eVar.f125118f.f142733g;
                        if (p832 != null) {
                            Log.m105925i("MicroMsg.OpenECardProcess", "succ title: %s", p832.f139636d);
                            try {
                                C76501b.this.f232423c.putByteArray("key_open_card_finish_title", eVar.f125118f.f142733g.toByteArray());
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.OpenECardProcess", e, "", new Object[0]);
                            }
                        }
                        C76501b.this.mo91264o(this.f221418a, 0, bundle);
                    } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, ucVar.f142732f)) {
                        C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, eVar.f125118f.f142731e, str), "", false);
                    }
                }
                return true;
            } else if (!(yVar2 instanceof C76399f)) {
                return false;
            } else {
                this.f221419b.mo105630i(Exif.PARSE_EXIF_ERROR_CORRUPT);
                C76399f fVar = (C76399f) yVar2;
                if (i == 0 && i2 == 0) {
                    C77985q63 q632 = fVar.f223707f;
                    if (q632.f228111d == 0) {
                        this.f221418a.getIntent().putExtra("key_open_card_bind_token", fVar.f223707f.f228114g);
                    } else if (!C76397d.m91817c((WalletBaseUI) this.f221418a, q632.f228116i)) {
                        int i3 = fVar.f223711j;
                        String str2 = fVar.f223712n;
                        C77985q63 q633 = fVar.f223707f;
                        if (!C76397d.m91816b((WalletBaseUI) this.f221418a, fVar, i3, str2, q633.f228111d, q633.f228112e)) {
                            C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, fVar.f223707f.f228112e, fVar.f223712n, str), "", false);
                        }
                    }
                } else {
                    Log.m105929w("MicroMsg.OpenECardProcess", "net error: %s", fVar);
                    C76879j.m92712F(this.f221418a, C76397d.m91815a(this.f221418a, str), "", false);
                }
                return true;
            }
        }

        /* renamed from: f */
        public boolean mo91281f(Object... objArr) {
            boolean z;
            C76399f fVar;
            String str = objArr[0];
            int i = C76501b.this.f232423c.getInt("key_select_card_action");
            String H = C76501b.this.mo106735H();
            int i2 = C76501b.this.f232423c.getInt("key_verify_scene");
            Log.m105925i("MicroMsg.OpenECardProcess", "bind action: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 1) {
                z = true;
                fVar = new C76399f(C76501b.m91962F(C76501b.this), H, C76501b.this.f232423c.getString("key_bind_card_no"), C76501b.this.f232423c.getString("key_bind_mobile_no"), C76501b.this.f232423c.getString("key_bind_bank_type"), C76501b.this.mo106734G(), true, true, false, i2, "");
            } else {
                z = true;
                fVar = new C76399f(C76501b.m91962F(C76501b.this), H, C76501b.this.f232423c.getString("key_bind_new_card_no"), C76501b.this.f232423c.getString("key_bind_new_card_mobile"), C76501b.this.f232423c.getString("key_bind_new_card_bank_type"), C76501b.this.mo106734G(), false, true, false, i2, "");
            }
            this.f221419b.mo105624c(Exif.PARSE_EXIF_ERROR_CORRUPT);
            this.f221419b.mo95362b(fVar, z);
            return z;
        }
    }

    /* renamed from: F */
    public static String m91962F(C76501b bVar) {
        String string = bVar.f232423c.getString("key_ecard_type");
        return Util.isNullOrNil(string) ? "WEB_DEBIT" : string;
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletOpenECardProxyUI.class, bundle);
        Log.m105925i("MicroMsg.OpenECardProcess", "start open ecard: %s", Integer.valueOf(mo106734G()));
        return this;
    }

    /* renamed from: G */
    public final int mo106734G() {
        return this.f232423c.getInt("key_open_scene");
    }

    /* renamed from: H */
    public final String mo106735H() {
        return this.f232423c.getString("key_req_serial");
    }

    /* renamed from: I */
    public final void mo106736I(Activity activity, Bundle bundle) {
        Log.printInfoStack("MicroMsg.OpenECardProcess", "gotoFinishUI, openScene: %s", Integer.valueOf(mo106734G()));
        if (mo106734G() == 3) {
            bundle.putInt("key_open_scene", 3);
            bundle.putString("key_open_extra_data", this.f232423c.getString("key_open_extra_data", ""));
            mo109103B(activity, WalletOpenLqbProxyUI.class, bundle);
            return;
        }
        mo109103B(activity, WalletECardFinishUI.class, (Bundle) null);
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        Class<WalletECardBindCardListUI> cls = WalletECardBindCardListUI.class;
        if (i == 100) {
            Log.m105924i("MicroMsg.OpenECardProcess", "back to card list");
            int G = mo106734G();
            String H = mo106735H();
            this.f232423c.clear();
            this.f232423c.putInt("key_open_scene", G);
            this.f232423c.putString("key_req_serial", H);
            this.f232423c.putString("key_pwd1", (String) this.f232423c.get("key_pwd1"));
            mo109108d(activity, cls, (Bundle) null, 0);
        } else if (!(activity instanceof WalletVerifyCodeUI)) {
        } else {
            if (this.f232423c.getInt("key_select_card_action") == 1) {
                mo109108d(activity, cls, (Bundle) null, 0);
            } else {
                mo109108d(activity, WalletECardCheckOtherCardUI.class, (Bundle) null, 0);
            }
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "OpenECardProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Log.m105925i("MicroMsg.OpenECardProcess", "end process: %s", activity);
        if (bundle == null) {
            bundle = new Bundle();
        }
        Intent intent = new Intent(activity, WalletOpenECardProxyUI.class);
        intent.putExtras(bundle);
        mo109110h(activity, WalletOpenECardProxyUI.class, bundle.containsKey("key_process_result_code") ? bundle.getInt("key_process_result_code", 0) : 0, intent, true);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        Class<WalletCheckPwdUI> cls = WalletCheckPwdUI.class;
        Class<WalletECardBindCardListUI> cls2 = WalletECardBindCardListUI.class;
        Class<WalletVerifyCodeUI> cls3 = WalletVerifyCodeUI.class;
        if (activity2 instanceof WalletCheckPwdUI) {
            if (bundle2.getBoolean("key_is_reuse_existing_ecard", false)) {
                Log.m105924i("MicroMsg.OpenECardProcess", "forward, is reuse exist card");
                this.f232423c.putBoolean("key_is_reuse_existing_ecard", true);
                mo109103B(activity2, WalletOpenECardProxyUI.class, bundle2);
                activity.finish();
                return;
            }
            mo109103B(activity2, cls2, (Bundle) null);
        } else if (activity2 instanceof WalletECardBindCardListUI) {
            if (this.f232423c.getInt("key_select_card_action", 1) != 1) {
                mo109103B(activity2, WalletECardCheckOtherCardUI.class, (Bundle) null);
            } else if (bundle2.getBoolean("key_need_verify_sms")) {
                bundle2.putBoolean("key_need_confirm_finish", true);
                mo109104C(activity2, cls3, (Bundle) null, bundle2);
            } else {
                mo106736I(activity2, bundle2);
            }
        } else if (activity2 instanceof WalletVerifyCodeUI) {
            mo106736I(activity2, bundle2);
        } else if (activity2 instanceof WalletECardCheckOtherCardUI) {
            boolean z = bundle2.getBoolean("key_check_other_card_need_input_card_elem", false);
            boolean z2 = bundle2.getBoolean("key_need_verify_sms");
            Log.m105925i("MicroMsg.OpenECardProcess", "input card elem: %s, verify sms: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
            if (z) {
                mo109103B(activity2, WalletECardElementInputUI.class, (Bundle) null);
            } else if (!z2) {
                mo106736I(activity2, bundle2);
            } else {
                bundle2.putBoolean("key_need_confirm_finish", true);
                mo109104C(activity2, cls3, (Bundle) null, bundle2);
            }
        } else if (activity2 instanceof WalletECardElementInputUI) {
            if (bundle2.getBoolean("key_need_verify_sms")) {
                bundle2.putBoolean("key_need_confirm_finish", true);
                mo109104C(activity2, cls3, (Bundle) null, bundle2);
                return;
            }
            mo106736I(activity2, bundle2);
        } else if (activity2 instanceof WalletOpenECardProxyUI) {
            boolean z3 = bundle2.getBoolean("key_is_token_invalid", false);
            this.f232423c.putBoolean("key_is_token_invalid", z3);
            String string = this.f232423c.getString("key_open_token");
            int G = mo106734G();
            int i2 = bundle2.getInt("key_ecard_proxy_action", 1);
            Log.m105925i("MicroMsg.OpenECardProcess", "forward openScene: %s, token==null: %s, isTokenInvalid: %s, action: %s", Integer.valueOf(G), Boolean.valueOf(Util.isNullOrNil(string)), Boolean.valueOf(z3), Integer.valueOf(i2));
            if (i2 == 1) {
                if (Util.isNullOrNil(string)) {
                    mo109106E(activity2, cls, bundle2, 1);
                } else if (z3) {
                    mo109103B(activity2, cls, bundle2);
                } else if (G == 3) {
                    mo109103B(activity2, cls2, (Bundle) null);
                }
            } else if (bundle2.getBoolean("key_need_verify_sms")) {
                bundle2.putBoolean("key_need_confirm_finish", true);
                mo109104C(activity2, cls3, (Bundle) null, bundle2);
            } else {
                mo106736I(activity2, bundle2);
            }
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C76503b(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletVerifyCodeUI) {
            return new C76517g(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletECardBindCardListUI) {
            return new C76511d(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletECardCheckOtherCardUI) {
            return new C76502a(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletECardElementInputUI) {
            return new C76515e(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletOpenECardProxyUI) {
            return new C76506c(mMActivity, iVar);
        }
        if (mMActivity instanceof WalletOpenLqbProxyUI) {
            return new C76516f(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }

    /* renamed from: v */
    public boolean mo106737v(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.OpenECardProcess", "intercept");
        bundle.putInt("key_process_result_code", 0);
        return false;
    }
}
