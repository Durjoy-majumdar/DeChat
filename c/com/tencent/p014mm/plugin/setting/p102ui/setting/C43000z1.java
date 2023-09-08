package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p216op.C47389f;
import p216op.C47392i;
import uc0.C52516b;
import uc0.C52524x;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.z1 */
public class C43000z1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsChattingBackgroundUI f116417d;

    public C43000z1(SettingsChattingBackgroundUI settingsChattingBackgroundUI) {
        this.f116417d = settingsChattingBackgroundUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SettingsChattingBackgroundUI settingsChattingBackgroundUI = this.f116417d;
        int i2 = SettingsChattingBackgroundUI.f116284g;
        settingsChattingBackgroundUI.getClass();
        Class cls = C47389f.class;
        C52516b bVar = (C52516b) ((C47389f) C86312j.m106911c(cls)).Bk0();
        Cursor rawQuery = bVar.f146680d.rawQuery("select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo  ", (String[]) null);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.SettingsChattingBackgroundUI", "applyToAll : cursor is null");
            return;
        }
        C47392i SU = ((C47389f) C86312j.m106911c(cls)).mo72331SU();
        if (rawQuery.moveToFirst()) {
            while (!rawQuery.isAfterLast()) {
                String string = rawQuery.getString(0);
                rawQuery.getInt(1);
                rawQuery.getString(2);
                rawQuery.getString(3);
                rawQuery.getString(4);
                rawQuery.getInt(5);
                rawQuery.getInt(6);
                C52524x xVar = (C52524x) SU;
                C86013q1.m106447h(xVar.mo73469qq(string == null ? "" : string, true));
                if (string == null) {
                    string = "";
                }
                C86013q1.m106447h(xVar.mo73469qq(string, false));
                rawQuery.moveToNext();
            }
        }
        rawQuery.close();
        if (bVar.f146680d.delete("chattingbginfo", (String) null, (String[]) null) > 0) {
            bVar.doNotify();
        }
    }
}
