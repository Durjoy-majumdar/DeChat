package com.tencent.p014mm.plugin.nfc_open.p802ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/nfc_open/ui/TransparentUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.nfc_open.ui.TransparentUI */
public class TransparentUI extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        C85875k4.m106177d0(getWindow());
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        overridePendingTransition(0, 0);
    }
}
