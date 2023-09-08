package fd0;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NotifyNewFriendRequestEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72982l3;
import com.tencent.p014mm.storage.C72987n3;
import com.tencent.p014mm.storage.C72992v4;
import di3.C86301e;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: fd0.h */
public class C75743h extends C86301e {
    public static C72982l3 vx0() {
        C86709a0.m107523b().mo121108c();
        return (C72982l3) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96096M5();
    }

    public static C72987n3 wx0() {
        C86709a0.m107523b().mo121108c();
        C72982l3 vx02 = vx0();
        C72987n3 n3Var = (C72987n3) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96104vj();
        n3Var.add((MStorage.IOnStorageChange) vx02, C86709a0.m107525e().getLooper());
        return n3Var;
    }

    public static C72957c4 xx0() {
        C86709a0.m107523b().mo121108c();
        return (C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB();
    }

    public static C72992v4 yx0() {
        C86709a0.m107523b().mo121108c();
        return (C72992v4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).Cc0();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        int Ow = vx0().mo101166Ow();
        long currentTimeMillis = System.currentTimeMillis() - Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119684e(340225, (Object) null), 0);
        Log.m105924i("MicroMsg.SubCoreVerify", "timeInterval = " + currentTimeMillis);
        if (currentTimeMillis > 259200000 && Ow > 0) {
            C72982l3 vx02 = vx0();
            vx02.getClass();
            Cursor rawQuery = vx02.f212805d.rawQuery(String.format("select %s from %s where isNew = 1 ORDER BY lastModifiedTime DESC limit %d", new Object[]{"contentNickname", "fmessage_conversation", 2}), (String[]) null, 2);
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("contentNickname")));
            }
            rawQuery.close();
            int size = arrayList.size();
            if (size > 0) {
                String str = (String) arrayList.get(0);
                for (int i = 1; i < size; i++) {
                    str = str + ", " + ((String) arrayList.get(i));
                }
                Log.m105924i("MicroMsg.SubCoreVerify", "title = " + str);
                NotifyNewFriendRequestEvent notifyNewFriendRequestEvent = new NotifyNewFriendRequestEvent();
                NotifyNewFriendRequestEvent.C40146a aVar = notifyNewFriendRequestEvent.f107665d;
                aVar.f107666a = null;
                aVar.f107667b = str;
                aVar.f107668c = 0;
                notifyNewFriendRequestEvent.publish();
                C97625j3.m125812b().mo105906u().mo119676J(340225, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        ((MMNotification) C97625j3.m125816f()).mo93209g();
    }
}
