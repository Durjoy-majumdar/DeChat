package bl2;

import al2.C0085a;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ScanBankCardResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct;
import com.tencent.p014mm.plugin.scanner.p101ui.ConfirmScanBankCardResultUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.scanlib.p325ui.ScanView;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ie3.C76324c;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import ml2.C10931f;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C50473n00;
import te3.C50649o9;
import te3.C51539uf3;
import te3.C51690vg;

/* renamed from: bl2.a */
public class C0315a extends C10931f<Bundle> implements C10931f.C10933a, C11385n {

    /* renamed from: g */
    public int f896g;

    /* renamed from: h */
    public String f897h = MD5Util.getMD5String(C75592q0.m90789s() + System.currentTimeMillis());

    /* renamed from: i */
    public boolean f898i;

    /* renamed from: j */
    public Bitmap f899j;

    /* renamed from: n */
    public WCPayScanBankCardNumberStruct f900n;

    public C0315a(int i, ScanView scanView, C10931f.C10932b bVar, WCPayScanBankCardNumberStruct wCPayScanBankCardNumberStruct) {
        this.f32580d = scanView;
        this.f32581e = bVar;
        this.f900n = wCPayScanBankCardNumberStruct;
        this.f32582f = scanView.getContext();
        C86709a0.m107524d().mo123455a(2693, this);
    }

    /* renamed from: b */
    public void mo361b(int i, Bundle bundle) {
        Log.m105925i("MicroMsg.BankCardHandler", "notify Event: %d", Integer.valueOf(i));
        if (i == 1 || i == 2) {
            this.f32580d.mo24373f();
        } else if (i == 3) {
            this.f32581e.mo6125q();
        } else if (i == 5) {
            this.f32580d.mo24372e();
        }
    }

    /* renamed from: d */
    public void mo360a(long j, Bundle bundle) {
        if (bundle != null) {
            Bitmap bitmap = (Bitmap) bundle.getParcelable("param_card_bitmap");
            this.f899j = bitmap;
            if (bitmap != null) {
                String str = this.f897h;
                byte[] Bitmap2Bytes = BitmapUtil.Bitmap2Bytes(bitmap);
                int i = this.f896g;
                this.f896g = i + 1;
                C86709a0.m107524d().mo123460f(new C0085a(3, 101, str, Bitmap2Bytes, i));
                return;
            }
            mo361b(2, (Bundle) null);
        }
    }

    public void destroy() {
        C86709a0.m107524d().mo123470p(2693, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Bitmap createBitmap;
        boolean z = true;
        Log.m105925i("MicroMsg.BankCardHandler", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C0085a aVar = (C0085a) yVar;
            if (this.f897h.equals(aVar.f518e)) {
                C47465a aVar2 = aVar.f517d.f127056b.f127083a;
                C50649o9 o9Var = aVar2 != null ? ((C51690vg) aVar2).f143473d : null;
                if (o9Var != null) {
                    String str2 = o9Var.f139037e.f132704d;
                    Log.m105919d("MicroMsg.BankCardHandler", "cardNumber %s", str2);
                    C51539uf3 uf32 = o9Var.f139037e.f132705e;
                    C50473n00 n002 = uf32.f142836h;
                    C50473n00 n003 = uf32.f142838j;
                    Rect rect = new Rect((int) n002.f138302d, (int) n002.f138303e, (int) n003.f138302d, (int) n003.f138303e);
                    Log.m105925i("MicroMsg.BankCardHandler", "cropRect %s", rect);
                    Bitmap bitmap = this.f899j;
                    if (rect.left < 0 || rect.top < 0 || rect.width() <= 0 || rect.width() > bitmap.getWidth() || rect.height() <= 0 || rect.height() > bitmap.getHeight()) {
                        z = false;
                    }
                    if (z && (createBitmap = Bitmap.createBitmap(this.f899j, rect.left, rect.top, rect.width(), rect.height())) != null && !Util.isNullOrNil(str2)) {
                        if (this.f898i) {
                            Map<String, Bitmap> map = ConfirmScanBankCardResultUI.f20568h;
                            Class cls = C76324c.class;
                            if (!createBitmap.isRecycled() && !Util.isNullOrNil(str2)) {
                                Intent intent = new Intent();
                                Context crossActivity = ((C76324c) C86312j.m106911c(cls)).TenPaySDKABTestKindaEnable() ? ((C76324c) C86312j.m106911c(cls)).getCrossActivity() : null;
                                if (crossActivity == null) {
                                    crossActivity = MMApplicationContext.getContext();
                                    intent.addFlags(268435456);
                                }
                                intent.setClass(crossActivity, ConfirmScanBankCardResultUI.class);
                                intent.putExtra("_card_num_", str2);
                                String str3 = "_image_cache_key_" + str2;
                                ((HashMap) ConfirmScanBankCardResultUI.f20568h).put(str3, createBitmap);
                                intent.putExtra("_image_cache_key_", str3);
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(intent);
                                Context context = crossActivity;
                                C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "startConfirm", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                crossActivity.startActivity((Intent) aVar3.mo10231a(0));
                                C117292a.m165359e(context, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "startConfirm", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        } else {
                            ScanBankCardResultEvent scanBankCardResultEvent = new ScanBankCardResultEvent();
                            ScanBankCardResultEvent.C1126a aVar4 = scanBankCardResultEvent.f9465d;
                            aVar4.f9466a = str2;
                            aVar4.f9467b = createBitmap;
                            scanBankCardResultEvent.publish();
                        }
                        this.f900n.f10092d = 3;
                        mo361b(3, (Bundle) null);
                        return;
                    }
                }
            }
            mo361b(2, (Bundle) null);
            return;
        }
        mo361b(2, (Bundle) null);
    }
}
