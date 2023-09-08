package com.tencent.p014mm.p136ui.bizchat;

import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import eb0.C97625j3;
import java.util.Iterator;
import java.util.LinkedList;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48334c;
import sb0.C48353j;
import zh3.C91753f;

/* renamed from: com.tencent.mm.ui.bizchat.g */
public class C44756g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121480d;

    public C44756g(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121480d = bizChatConversationFmUI;
    }

    public void run() {
        Log.m105924i("MicroMsg.BizChatConversationFmUI", "updateChatInfoFromSvr");
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Cursor Ow = C48009v0.Dx0().mo73022Ow(this.f121480d.f121342j);
        if (Ow.moveToFirst()) {
            while (!Ow.isAfterLast()) {
                C48327a aVar = new C48327a();
                aVar.convertFrom(Ow);
                Ow.moveToNext();
                C48334c a0 = C48009v0.Ax0().mo73042a0(aVar.field_bizChatId);
                if (a0.mo73038q2()) {
                    if (a0.mo73037p2()) {
                        linkedList2.add(a0.field_bizChatServId);
                    } else {
                        linkedList.add(a0.field_bizChatServId);
                    }
                }
            }
        }
        Ow.close();
        if (linkedList2.size() > 0) {
            C48009v0.yx0().mo73054a(linkedList2, this.f121480d.f121342j);
        }
        BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f121480d;
        bizChatConversationFmUI.getClass();
        if (linkedList.size() == 0) {
            Log.m105924i("MicroMsg.BizChatConversationFmUI", "userIdList is empty");
        } else {
            SharedPreferences sharedPreferences = bizChatConversationFmUI.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            if (sharedPreferences.getBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + bizChatConversationFmUI.f121342j, true)) {
                Log.m105924i("MicroMsg.BizChatConversationFmUI", "updateData");
                long currentTimeMillis = System.currentTimeMillis();
                ISQLiteDatabase iSQLiteDatabase = C48009v0.Bx0().f129458e;
                long j = 0;
                boolean z = iSQLiteDatabase instanceof C91753f;
                if (z) {
                    j = ((C91753f) iSQLiteDatabase).beginTransaction(Thread.currentThread().getId());
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C48334c Lo = C48009v0.Ax0().mo73039Lo(str);
                    if (Lo != null && !Lo.mo73037p2()) {
                        C48353j jVar = C48009v0.Bx0().get(str);
                        String str2 = jVar != null ? jVar.field_userName : null;
                        if (str2 != null && !str2.equals(Lo.field_chatName)) {
                            Lo.field_chatName = str2;
                            C48009v0.Ax0().mo73040Ow(Lo);
                        }
                    }
                }
                if (z) {
                    C97625j3.m125812b().mo105909x().endTransaction(j);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("FIRST_TIME_IN_BIZCHAT_CONV_" + bizChatConversationFmUI.f121342j, false).commit();
                Log.m105919d("MicroMsg.BizChatConversationFmUI", "updateData use time:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
        if (linkedList.size() > 0) {
            C48009v0.yx0().mo73055b(linkedList, this.f121480d.f121342j);
        }
    }
}
