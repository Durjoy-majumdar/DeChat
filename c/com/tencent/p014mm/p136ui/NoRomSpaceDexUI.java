package com.tencent.p014mm.p136ui;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.NoRomSpaceDexUI */
public class NoRomSpaceDexUI extends HellActivity implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public PendingIntent f214614d;

    public Resources getResources() {
        return MMApplicationContext.getResources();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        PendingIntent pendingIntent = this.f214614d;
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        finish();
        int myPid = Process.myPid();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(myPid));
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/ui/NoRomSpaceDexUI", "onClick", "(Landroid/content/DialogInterface;I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/ui/NoRomSpaceDexUI", "onClick", "(Landroid/content/DialogInterface;I)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
        setContentView(C0966R.C0971layout.f359914bl1);
        Intent intent = getIntent();
        this.f214614d = (PendingIntent) intent.getParcelableExtra("action");
        C73153b1 b1Var = new C73153b1(this);
        if (intent.hasExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            b1Var.setTitle((CharSequence) intent.getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        } else {
            b1Var.setTitle(intent.getIntExtra("titleRes", C0966R.string.bcy));
        }
        if (intent.hasExtra(StateEvent.Name.MESSAGE)) {
            String stringExtra = intent.getStringExtra(StateEvent.Name.MESSAGE);
            b1Var.f214717j.setVisibility(0);
            b1Var.f214715h.setVisibility(0);
            b1Var.f214715h.setText(stringExtra);
        } else {
            int intExtra = intent.getIntExtra("messageRes", C0966R.string.bcx);
            b1Var.f214717j.setVisibility(0);
            b1Var.f214715h.setVisibility(0);
            b1Var.f214715h.setText(intExtra);
        }
        if (intent.hasExtra("button")) {
            String stringExtra2 = intent.getStringExtra(StateEvent.Name.MESSAGE);
            b1Var.f214717j.setVisibility(0);
            b1Var.f214715h.setVisibility(0);
            b1Var.f214715h.setText(stringExtra2);
        } else {
            String string = getString(intent.getIntExtra("buttonRes", C0966R.string.bcv));
            Button button = b1Var.f214713f;
            if (button != null) {
                button.setVisibility(0);
                b1Var.f214713f.setText(string);
                b1Var.f214713f.setOnClickListener(new C73150a1(b1Var, this, true));
            }
        }
        b1Var.setCancelable(false);
        b1Var.mo101591c(false);
        b1Var.show();
    }
}
