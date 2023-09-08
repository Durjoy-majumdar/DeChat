package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanBankCardConfirmResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI */
public class ConfirmScanBankCardResultUI extends MMActivity {

    /* renamed from: h */
    public static final Map<String, Bitmap> f20568h = new HashMap();

    /* renamed from: d */
    public Bitmap f20569d = null;

    /* renamed from: e */
    public String f20570e = null;

    /* renamed from: f */
    public ImageView f20571f;

    /* renamed from: g */
    public EditText f20572g;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI$a */
    public class C5160a implements View.OnClickListener {
        public C5160a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditText editText = ConfirmScanBankCardResultUI.this.f20572g;
            if (editText != null) {
                String obj = editText.getEditableText().toString();
                if (Util.isNullOrNil(obj)) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                ConfirmScanBankCardResultUI.this.finish();
                ScanBankCardConfirmResultEvent scanBankCardConfirmResultEvent = new ScanBankCardConfirmResultEvent();
                ScanBankCardConfirmResultEvent.C1125a aVar = scanBankCardConfirmResultEvent.f9461d;
                aVar.f9463b = 1;
                aVar.f9462a = obj;
                aVar.f9464c = ConfirmScanBankCardResultUI.this.f20569d;
                scanBankCardConfirmResultEvent.publish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI$b */
    public class C5161b implements MenuItem.OnMenuItemClickListener {
        public C5161b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ConfirmScanBankCardResultUI confirmScanBankCardResultUI = ConfirmScanBankCardResultUI.this;
            Map<String, Bitmap> map = ConfirmScanBankCardResultUI.f20568h;
            confirmScanBankCardResultUI.mo6121H7();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo6121H7() {
        Intent intent = new Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", true);
        intent.addFlags(268435456);
        intent.setClass(this, ScanCardUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "goBackScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "goBackScan", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7049w4;
    }

    public void onBackPressed() {
        mo6121H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.iey);
        boolean z = false;
        if (getIntent() == null) {
            Log.m105920e("MicroMsg.ConfirmScanBankCardResultUI", "intent is null, return");
        } else {
            String stringExtra = getIntent().getStringExtra("_image_cache_key_");
            this.f20570e = stringExtra;
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105920e("MicroMsg.ConfirmScanBankCardResultUI", "bmp cache key is null or nil");
            } else {
                Bitmap bitmap = (Bitmap) ((HashMap) f20568h).get(this.f20570e);
                this.f20569d = bitmap;
                if (bitmap == null || bitmap.isRecycled()) {
                    Log.m105920e("MicroMsg.ConfirmScanBankCardResultUI", "bmp invalid, return");
                } else {
                    z = true;
                }
            }
        }
        if (!z) {
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("_card_num_");
        if (Util.isNullOrNil(stringExtra2)) {
            Log.m105920e("MicroMsg.ConfirmScanBankCardResultUI", "cardNum is null or nil");
            finish();
            return;
        }
        this.f20571f = (ImageView) findViewById(C0966R.C0970id.f3a);
        this.f20572g = (EditText) findViewById(C0966R.C0970id.cao);
        this.f20571f.setImageBitmap(this.f20569d);
        this.f20572g.setText(stringExtra2);
        findViewById(C0966R.C0970id.anv).setOnClickListener(new C5160a());
        setBackBtn(new C5161b());
    }

    public void onDestroy() {
        super.onDestroy();
        ImageView imageView = this.f20571f;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        if (!Util.isNullOrNil(this.f20570e)) {
            ((HashMap) f20568h).remove(this.f20570e);
        }
        Bitmap bitmap = this.f20569d;
        if (bitmap != null) {
            Log.m105925i("MicroMsg.ConfirmScanBankCardResultUI", "bitmap recycle %s", bitmap.toString());
            this.f20569d.recycle();
        }
    }
}
