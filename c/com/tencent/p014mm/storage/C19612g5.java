package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.MStorage;

/* renamed from: com.tencent.mm.storage.g5 */
public class C19612g5 extends MStorage {

    /* renamed from: d */
    public static final String[] f55489d = {"CREATE TABLE IF NOT EXISTS verifycontact ( id INTEGER PRIMARY KEY, username varchar(40), nickname varchar(40), fullpy varchar(60), shortpy varchar(40), imgflag int, scene int, content text, status int, reserved1 int,reserved2 int,reserved3 text,reserved4 text)", "CREATE UNIQUE INDEX IF NOT EXISTS verifyContactIndex  ON verifycontact ( username )"};
}
