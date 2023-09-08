package iv0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.backup.backupui.BackupChooseBackupModeUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import ev0.C20612a;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

public final /* synthetic */ class d$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BackupChooseBackupModeUI f29006d;

    public /* synthetic */ d$$b(BackupChooseBackupModeUI backupChooseBackupModeUI) {
        this.f29006d = backupChooseBackupModeUI;
    }

    public final void onClick(View view) {
        BackupChooseBackupModeUI backupChooseBackupModeUI = this.f29006d;
        int i = BackupChooseBackupModeUI.f12012e;
        backupChooseBackupModeUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupChooseBackupModeUI, array);
        if (C20612a.m22481n(backupChooseBackupModeUI, C0966R.string.mq8)) {
            C117292a.m165361g(backupChooseBackupModeUI, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, backupChooseBackupModeUI.getString(C0966R.string.ach));
        intent.putExtra("rawUrl", backupChooseBackupModeUI.getString(C0966R.string.adz, new Object[]{LocaleUtil.getApplicationLanguage()}));
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        C88144b.m109791i(backupChooseBackupModeUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(backupChooseBackupModeUI, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
