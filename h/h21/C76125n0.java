package h21;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import e21.C45532f;
import e21.C45534g;
import e21.C75481j0;
import eb0.C75592q0;
import f40.C86709a0;
import hp3.C87581a;
import ob0.C89132b;
import te3.C51862wp;
import te3.C52148yp;

/* renamed from: h21.n0 */
public class C76125n0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223039g;

    /* renamed from: h21.n0$a */
    public class C76126a implements C87581a<Object, C89132b.C89134c<C51862wp>> {
        public C76126a() {
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeSettingUI", "CgiF2fShortTermQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (C76125n0.this.f223039g.isFinishing() || C76125n0.this.f223039g.isDestroyed() || (t = cVar.f256796d) == null) {
                return null;
            }
            if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                WalletCollectQrCodeSettingUI.m81119I7(C76125n0.this.f223039g, cVar.f256795c);
            } else if (((C51862wp) t).f144184f == 2) {
                Intent intent = new Intent();
                intent.putExtra("ftf_pay_url", ((C51862wp) cVar.f256796d).f144182d);
                intent.putExtra("key_error_level", ((C51862wp) cVar.f256796d).f144183e);
                intent.putExtra("ftf_fixed_fee", (int) ((C51862wp) cVar.f256796d).f144185g);
                intent.putExtra("ftf_fixed_desc", ((C51862wp) cVar.f256796d).f144186h);
                intent.putExtra("key_type", "1");
                intent.putExtra("key_save_notify_info", new String(((C51862wp) cVar.f256796d).f144187i.mo123703f()));
                C76125n0.this.f223039g.setResult(-1, intent);
                C76125n0.this.f223039g.hideVKB();
                C76125n0.this.f223039g.finish();
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: h21.n0$b */
    public class C76127b implements C87581a<Object, C89132b.C89134c<C52148yp>> {
        public C76127b() {
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeSettingUI", "CgiF2fShortTermQrcode cgiBack.errType:%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (C76125n0.this.f223039g.isFinishing() || C76125n0.this.f223039g.isDestroyed() || (t = cVar.f256796d) == null) {
                return null;
            }
            if (cVar.f256793a != 0 || cVar.f256794b != 0) {
                WalletCollectQrCodeSettingUI.m81119I7(C76125n0.this.f223039g, cVar.f256795c);
            } else if (((C52148yp) t).f145445f == 2) {
                Intent intent = new Intent();
                intent.putExtra("ftf_pay_url", ((C52148yp) cVar.f256796d).f145443d);
                intent.putExtra("key_error_level", ((C52148yp) cVar.f256796d).f145444e);
                intent.putExtra("ftf_fixed_fee", (int) ((C52148yp) cVar.f256796d).f145446g);
                intent.putExtra("ftf_fixed_fee_type", "1");
                intent.putExtra("ftf_fixed_desc", ((C52148yp) cVar.f256796d).f145447h);
                C76125n0.this.f223039g.setResult(-1, intent);
                C76125n0.this.f223039g.hideVKB();
                C76125n0.this.f223039g.finish();
            }
            return Boolean.TRUE;
        }
    }

    public C76125n0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223039g = walletCollectQrCodeSettingUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        double d = Util.getDouble(this.f223039g.f197819d.getText(), 0.0d);
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        Log.m105925i("MicroMsg.WalletCollectQrCodeSettingUI", "wallet region: %s", Integer.valueOf(intValue));
        if (!this.f223039g.f197819d.mo105094l()) {
            WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = this.f223039g;
            WalletCollectQrCodeSettingUI.m81118H7(walletCollectQrCodeSettingUI, walletCollectQrCodeSettingUI.getString(C0966R.string.kmc));
        } else if (d < 0.01d) {
            WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI2 = this.f223039g;
            WalletCollectQrCodeSettingUI.m81118H7(walletCollectQrCodeSettingUI2, walletCollectQrCodeSettingUI2.getString(C0966R.string.hzn));
        } else if (intValue == 8) {
            this.f223039g.doSceneForceProgress(new C75481j0(Math.round(d * 100.0d), 1, this.f223039g.f197822g, C75592q0.m90784n()));
        } else {
            int intExtra = this.f223039g.getIntent().getIntExtra("key_type", 1);
            int X = C75228t.m90231X(this.f223039g.f197819d.getText(), "100");
            if (intExtra == 2) {
                C45534g gVar = new C45534g(X, "1", this.f223039g.f197822g, false, "", 1);
                AppCompatActivity context = this.f223039g.getContext();
                gVar.f221056i = true;
                gVar.f221058n = context;
                gVar.mo9225i().mo123062e(new C76126a());
                return;
            }
            C45532f fVar = new C45532f(X, "1", this.f223039g.f197822g, false, "", 1);
            AppCompatActivity context2 = this.f223039g.getContext();
            fVar.f221056i = true;
            fVar.f221058n = context2;
            fVar.mo9225i().mo123062e(new C76127b());
        }
    }
}
