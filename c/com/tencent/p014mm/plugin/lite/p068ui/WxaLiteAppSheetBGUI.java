package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppSheetBGUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetBGUI */
public final class WxaLiteAppSheetBGUI extends AppCompatActivity {
    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2328p, C0966R.C0968anim.f2329q);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0966R.C0971layout.d2p);
        getIntent().setClass(MMApplicationContext.getContext(), WxaLiteAppSheetUI.class);
        startActivityForResult(getIntent(), 0);
        overridePendingTransition(C0966R.C0968anim.f2328p, C0966R.C0968anim.f2329q);
    }
}
