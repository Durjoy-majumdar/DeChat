package hz0;

import android.database.Cursor;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: hz0.c */
public class C46141c extends MAutoStorage<CardInfo> {

    /* renamed from: e */
    public static final String[] f124343e = {MAutoStorage.getCreateSQLs(CardInfo.f51606W0, "UserCardInfo"), "CREATE INDEX IF NOT EXISTS  stickyIndexIndex ON UserCardInfo ( stickyIndex ) "};

    /* renamed from: d */
    public ISQLiteDatabase f124344d;

    public C46141c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, CardInfo.f51606W0, "UserCardInfo", (String[]) null);
        this.f124344d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public CardInfo mo71595Lo(String str) {
        CardInfo cardInfo = new CardInfo();
        cardInfo.field_card_id = str;
        if (super.get(cardInfo, new String[0])) {
            return cardInfo;
        }
        return null;
    }

    /* renamed from: jo */
    public Cursor mo71596jo(C46154m mVar) {
        long nowSecond = Util.nowSecond();
        this.f124344d.execSQL("UserCardInfo", "update UserCardInfo set stickyIndex=0, stickyEndTime=0 where stickyIndex>0 and (" + nowSecond + ">" + "stickyEndTime" + " and " + "stickyEndTime" + "<>0)");
        StringBuilder sb = new StringBuilder("select * from UserCardInfo");
        switch (mVar.ordinal()) {
            case 0:
                sb.append(" where (");
                sb.append("status");
                sb.append("=0");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=5");
                sb.append(")");
                break;
            case 1:
                sb.append(" where (");
                sb.append("status");
                sb.append("=1");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=2");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=3");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=4");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=6");
                sb.append(")");
                break;
            case 2:
                sb.append(" where (");
                sb.append("status");
                sb.append("=0");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=5");
                sb.append(") and (");
                sb.append("block_mask");
                sb.append("= '1");
                sb.append("' OR ");
                sb.append("block_mask");
                sb.append("= '0' ");
                sb.append(")");
                break;
            case 3:
                sb.append(" where (");
                sb.append("status");
                sb.append("=0");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=5");
                sb.append(")");
                sb.append(" AND ");
                sb.append("card_type");
                sb.append("!=10");
                break;
            case 4:
            case 5:
                sb.append(" where (");
                sb.append("status");
                sb.append("=0");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=5");
                sb.append(")");
                sb.append(" AND ");
                sb.append("card_type");
                sb.append("=10");
                break;
            case 6:
                sb.append(" where (");
                sb.append("status");
                sb.append("=0");
                sb.append(" OR ");
                sb.append("status");
                sb.append("=5");
                sb.append(")");
                sb.append(" AND ");
                sb.append("card_type");
                sb.append("!=10");
                sb.append(" AND ");
                sb.append("card_type");
                sb.append("!=30");
                break;
        }
        sb.append(" order by stickyIndex desc, ");
        sb.append("status asc , ");
        sb.append("updateTime desc");
        if (mVar == C46154m.HOME_MEMBER_CARD_TYPE) {
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_CARD_NUM_INT_SYNC, 3)).intValue();
            sb.append(" LIMIT ");
            sb.append(intValue);
        }
        return this.f124344d.rawQuery(sb.toString(), (String[]) null);
    }
}
