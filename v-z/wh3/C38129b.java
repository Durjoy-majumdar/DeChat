package wh3;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C30769q2;
import java.util.Iterator;

/* renamed from: wh3.b */
public class C38129b extends MAutoStorage<C38128a> {

    /* renamed from: e */
    public static final String[] f100763e = {MAutoStorage.getCreateSQLs(C38128a.f100762r, "EmojiDesignerProduct")};

    /* renamed from: d */
    public ISQLiteDatabase f100764d;

    public C38129b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38128a.f100762r, "EmojiDesignerProduct", (String[]) null);
        this.f100764d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public void mo61528jo(C30769q2 q2Var) {
        this.f100764d.delete("EmojiDesignerProduct", "designerUin=? ", new String[]{q2Var.f82741b + ""});
        Iterator<C38128a> it = q2Var.f82742c.iterator();
        while (it.hasNext()) {
            this.f100764d.insert("EmojiDesignerProduct", "", it.next().convertTo());
        }
    }
}
