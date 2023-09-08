package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintFinishUI */
public class VoicePrintFinishUI extends MMActivity {

    /* renamed from: d */
    public TextView f21704d;

    /* renamed from: e */
    public TextView f21705e;

    /* renamed from: f */
    public Button f21706f;

    /* renamed from: g */
    public ImageView f21707g;

    /* renamed from: h */
    public int f21708h;

    public int getLayoutId() {
        return C0966R.C0971layout.ccl;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.VoicePrintFinishUI", "VoicePrintFinishUI");
        super.onCreate(bundle);
        hideTitleView();
        int intExtra = getIntent().getIntExtra("kscene_type", 73);
        this.f21708h = intExtra;
        Log.m105919d("MicroMsg.VoicePrintFinishUI", "onCreate, sceneType:%d", Integer.valueOf(intExtra));
        this.f21704d = (TextView) findViewById(C0966R.C0970id.f359520lb3);
        this.f21705e = (TextView) findViewById(C0966R.C0970id.lb5);
        this.f21706f = (Button) findViewById(C0966R.C0970id.itd);
        this.f21707g = (ImageView) findViewById(C0966R.C0970id.f359519lb2);
        int i = this.f21708h;
        if (i == 72) {
            this.f21704d.setText(C0966R.string.kdm);
            this.f21705e.setText(C0966R.string.kdn);
            this.f21707g.setVisibility(0);
            this.f21706f.setText(C0966R.string.f361342j21);
        } else if (i == 73) {
            this.f21704d.setVisibility(8);
            this.f21705e.setText(C0966R.string.keb);
            this.f21707g.setVisibility(0);
            this.f21706f.setText(C0966R.string.f361343j22);
        }
        this.f21706f.setOnClickListener(new C5716h(this));
        setBackBtn(new C5717i(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
