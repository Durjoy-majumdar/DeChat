package com.tencent.p014mm.storage;

import g62.C75875l;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.storage.h */
public class C72974h extends C72959e {

    /* renamed from: c */
    public static final String[] f212784c = {"CREATE TABLE IF NOT EXISTS appbrandmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT ) ", "CREATE INDEX IF NOT EXISTS  appbrandmessageSvrIdIndex ON appbrandmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerIndex ON appbrandmessage ( talker )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalerStatusIndex ON appbrandmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTimeIndex ON appbrandmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageCreateTaklerTimeIndex ON appbrandmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageSendCreateTimeIndex ON appbrandmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  appbrandmessageTalkerTypeIndex ON appbrandmessage ( talker,type )"};

    public C72974h(C75875l lVar) {
        super(lVar);
        mo100942g(mo100940c(), "appbrandmessage");
        mo100939a(new C75875l.C75878d(256, "appbrandmessage", C75875l.C75878d.m91132a(3000001, 3500000, 102000001, 105000000)));
    }

    /* renamed from: f */
    public String mo100923f(String str) {
        Assert.assertTrue(str != null && str.length() > 0);
        if (C72996z1.m85804J4(str)) {
            return "appbrandmessage";
        }
        return null;
    }
}
