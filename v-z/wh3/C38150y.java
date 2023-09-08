package wh3;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;

/* renamed from: wh3.y */
public class C38150y extends MAutoStorage<SmileyPanelConfigInfo> {

    /* renamed from: e */
    public static final String[] f100803e = {MAutoStorage.getCreateSQLs(SmileyPanelConfigInfo.f82661p, "SmileyPanelConfigInfo")};

    /* renamed from: f */
    public static final String[] f100804f = {"position", "key"};

    /* renamed from: d */
    public ISQLiteDatabase f100805d;

    public C38150y(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100805d = iSQLiteDatabase;
    }
}
