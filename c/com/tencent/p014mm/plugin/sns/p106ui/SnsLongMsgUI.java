package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLongMsgUI */
public class SnsLongMsgUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$a */
    public class C5447a implements View.OnClickListener {
        public C5447a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$1");
            Intent intent = new Intent();
            intent.setClass(SnsLongMsgUI.this, SnsUploadUI.class);
            intent.putExtra("KSnsPostManu", true);
            intent.putExtra("KTouchCameraTime", Util.nowSecond());
            intent.putExtra("sns_comment_type", 1);
            intent.putExtra("Ksnsupload_type", 9);
            SnsLongMsgUI snsLongMsgUI = SnsLongMsgUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SnsLongMsgUI snsLongMsgUI2 = snsLongMsgUI;
            C117292a.m165358d(snsLongMsgUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsLongMsgUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(snsLongMsgUI2, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            SnsLongMsgUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
        return C0966R.C0971layout.b8j;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
        super.onCreate(bundle);
        setTitleVisibility(8);
        ((Button) findViewById(C0966R.C0970id.fgg)).setOnClickListener(new C5447a());
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
        if (i == 4 && keyEvent.getAction() == 0) {
            Intent intent = new Intent();
            intent.setClass(this, SnsUploadUI.class);
            intent.putExtra("KSnsPostManu", true);
            intent.putExtra("KTouchCameraTime", Util.nowSecond());
            intent.putExtra("sns_comment_type", 1);
            intent.putExtra("Ksnsupload_type", 9);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI");
        return onKeyDown;
    }
}
