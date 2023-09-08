package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceReCreatePromptUI */
public class VoiceReCreatePromptUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public View f21725d = null;

    public int getLayoutId() {
        return C0966R.C0971layout.ccn;
    }

    public final void init() {
        View findViewById = findViewById(C0966R.C0970id.iil);
        this.f21725d = findViewById;
        findViewById.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voiceprint/ui/VoiceReCreatePromptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this, VoiceCreateUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceReCreatePromptUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceReCreatePromptUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceReCreatePromptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        init();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
