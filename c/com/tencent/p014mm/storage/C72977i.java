package com.tencent.p014mm.storage;

import g62.C75875l;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.storage.i */
public class C72977i extends C72959e {

    /* renamed from: c */
    public static final String[] f212788c = {"CREATE TABLE IF NOT EXISTS appbrandnotifymessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT ) ", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageSvrIdIndex ON appbrandnotifymessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageTalkerIndex ON appbrandnotifymessage ( talker )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageTalerStatusIndex ON appbrandnotifymessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageCreateTimeIndex ON appbrandnotifymessage ( createTime )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageCreateTaklerTimeIndex ON appbrandnotifymessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageSendCreateTimeIndex ON appbrandnotifymessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandnotifymessageTalkerTypeIndex ON appbrandnotifymessage ( talker,type )"};

    public C72977i(C75875l lVar) {
        super(lVar);
        mo100942g(mo100940c(), "appbrandnotifymessage");
        mo100939a(new C75875l.C75878d(32, "appbrandnotifymessage", C75875l.C75878d.m91132a(3500001, 4000000, 105000001, 108000000)));
    }

    /* renamed from: f */
    public String mo100923f(String str) {
        Assert.assertTrue(str != null && str.length() > 0);
        if (C72996z1.m85806K4(str)) {
            return "appbrandnotifymessage";
        }
        return null;
    }
}
