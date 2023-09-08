package com.tencent.p014mm.chatroom.p015ui;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleCondition;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import i40.C46166d;
import java.util.LinkedList;
import java.util.List;
import p749xh.C53335e1;

/* renamed from: com.tencent.mm.chatroom.ui.ManageChatroomUI$$a */
public final /* synthetic */ class ManageChatroomUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ManageChatroomUI f194857d;

    /* renamed from: e */
    public final /* synthetic */ boolean f194858e;

    public /* synthetic */ ManageChatroomUI$$a(ManageChatroomUI manageChatroomUI, boolean z) {
        this.f194857d = manageChatroomUI;
        this.f194858e = z;
    }

    public final void run() {
        ManageChatroomUI manageChatroomUI = this.f194857d;
        boolean z = this.f194858e;
        String str = manageChatroomUI.f108078o;
        SingleTable singleTable = C53335e1.f149283M;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList.add(C53335e1.f149290S);
        Column column = C53335e1.f149285P;
        SingleCondition equal = column.equal(str);
        SingleTable singleTable2 = C53335e1.f149283M;
        SelectSql build = singleTable2.select((List<? extends ISqlColumn>) linkedList).where(equal).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build();
        C46166d dVar = C53335e1.f149324r1;
        C53335e1 e1Var = (C53335e1) build.singleQuery(dVar.getDB(), C53335e1.class);
        int i = (e1Var != null ? e1Var.field_chatroomStatus : 0) | Integer.MIN_VALUE;
        int i2 = z ? i | 4 : i & -5;
        ContentValues contentValues = new ContentValues();
        contentValues.put("chatroomStatus", Integer.valueOf(i2));
        Log.m105925i("MicroMsg.ManageChatroomUI", "dealModOnlyAdmin updateStatus mRoomId:%s isChecked:%s status:%s updateResult:%s", manageChatroomUI.f108078o, Boolean.valueOf(z), Integer.toBinaryString(i2), Integer.valueOf(singleTable2.update(contentValues).where(column.equal(manageChatroomUI.f108078o)).build().run(dVar.getDB())));
    }
}
