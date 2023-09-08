package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import cy3.C58003b;
import f40.C86709a0;
import gy3.C87412m;
import p248ug.C37467u;
import rx3.C13598b0;
import te3.C77949j3;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.r3 */
public final class C30774r3 extends MAutoStorage<C37467u> {

    /* renamed from: d */
    public static final C30774r3 f82750d = new C30774r3();

    /* renamed from: e */
    public static final String[] f82751e = {"*", "rowid"};

    /* renamed from: f */
    public static final C91753f f82752f;

    static {
        C91753f fVar = C86709a0.m107535s().f251811i;
        C87412m.m108591d(fVar);
        f82752f = fVar;
    }

    public C30774r3() {
        super(C86709a0.m107535s().f251811i, C37467u.f99010R0, "FunctionMsgItem", new String[]{"CREATE INDEX IF NOT EXISTS functionIdIndex ON FunctionMsgItem(functionmsgid)"});
    }

    /* renamed from: Lo */
    public final void mo57696Lo(String str, C37467u uVar) {
        C77949j3 j3Var;
        C87412m.m108594g(str, "functionMsgId");
        C87412m.m108594g(uVar, "newFunctionMsgItem");
        Log.m105925i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s", str);
        C37467u jo = mo57697jo(str);
        if (jo != null) {
            try {
                Object[] objArr = new Object[3];
                objArr[0] = str;
                objArr[1] = Boolean.valueOf(uVar.field_addMsg == null);
                objArr[2] = Boolean.valueOf(jo.field_addMsg == null);
                Log.m105925i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s, newFunctionMsgItem.msgContent==null: %s,oldFunctionMsgItem.msgContent==null: %s", objArr);
                ContentValues convertTo = uVar.convertTo();
                if (convertTo.get("addMsg") == null && (j3Var = jo.field_addMsg) != null) {
                    C87412m.m108591d(j3Var);
                    convertTo.put("addMsg", j3Var.toByteArray());
                }
                Log.m105925i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, ret: %s", Integer.valueOf(f82752f.update("FunctionMsgItem", convertTo, "functionmsgid=?", new String[]{str})));
            } catch (Exception e) {
                Log.m105921e("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: jo */
    public final C37467u mo57697jo(String str) {
        Throwable th;
        String str2 = str;
        C87412m.m108594g(str2, "functionMsgId");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Log.m105925i("FunctionMsg.FunctionMsgStorage", "getByFunctionMsgId, functionMsgId: %s", str2);
        Cursor query = f82752f.query("FunctionMsgItem", f82751e, "functionmsgid=?", new String[]{str2}, (String) null, (String) null, (String) null, 2);
        try {
            C87412m.m108591d(query);
            if (query.moveToFirst()) {
                C37467u uVar = new C37467u();
                uVar.convertFrom(query);
                C58003b.m67160a(query, (Throwable) null);
                return uVar;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            C58003b.m67160a(query, (Throwable) null);
            return null;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            C58003b.m67160a(query, th);
            throw th5;
        }
    }
}
