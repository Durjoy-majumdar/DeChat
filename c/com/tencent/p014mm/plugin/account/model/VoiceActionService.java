package com.tencent.p014mm.plugin.account.model;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import dg0.C75398e;
import di3.C86312j;
import eb0.C45628s0;
import p447aw.C103918d;
import p823sg.C90193h;
import wc3.C15131b;

/* renamed from: com.tencent.mm.plugin.account.model.VoiceActionService */
public class VoiceActionService extends SearchActionVerificationClientService {
    /* renamed from: a */
    public boolean mo1347a(Intent intent, boolean z, Bundle bundle) {
        if (!z) {
            Log.m105924i("MicroMsg.VoiceActionService", "Action is not verified");
            return false;
        }
        String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
        String i = C75398e.vx0().mo106402b(C90193h.m112878f(C15131b.m14237a(stringExtra).getBytes())).mo106389i();
        C7250m.m7431a().mo136257Tm(i, stringExtra2, C45628s0.m50810y(i), 0);
        try {
            mo1348b(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI"), stringExtra);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoiceActionService", e, "updateContactMarked error", new Object[0]);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo1348b(String str, String str2) {
        String[] split = str.split("/");
        String str3 = (split == null || split.length <= 0) ? "" : split[split.length - 1];
        if (Util.isNullOrNil(str3)) {
            Log.m105921e("MicroMsg.VoiceActionService", "extract contact Id error, %s %s", str, str2);
        } else if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(this, "android.permission.READ_CONTACTS")) {
            Log.m105920e("MicroMsg.VoiceActionService", "no contacts permission");
        } else {
            Cursor query = getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"_id"}, "contact_id=? AND data1=? AND account_type=? AND mimetype=?", new String[]{str3, str2, "com.tencent.mm.account", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction"}, (String) null);
            if (query == null || query.getCount() <= 0) {
                Log.m105924i("MicroMsg.VoiceActionService", "updateContactMarked: false");
            } else {
                query.moveToNext();
                Log.m105925i("MicroMsg.VoiceActionService", "updateContactMarked: %b", Boolean.valueOf(getContentResolver().update(ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(String.valueOf(query.getLong(0))).appendQueryParameter("type", "short_text").build(), new ContentValues(), (String) null, (String[]) null) > 0));
            }
            if (query != null) {
                query.close();
            }
        }
    }
}
