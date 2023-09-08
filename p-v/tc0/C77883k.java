package tc0;

import com.tencent.p014mm.sdk.storage.MStorage;
import g62.C75880o;
import zh3.C91753f;

/* renamed from: tc0.k */
public class C77883k extends MStorage {

    /* renamed from: e */
    public static final String[] f226918e = {"CREATE TABLE IF NOT EXISTS oplog2 ( id INTEGER PRIMARY KEY , inserTime long , cmdId int , buffer blob , reserved1 int , reserved2 long , reserved3 text , reserved4 text ) "};

    /* renamed from: d */
    public C91753f f226919d;

    public C77883k(C91753f fVar) {
        this.f226919d = fVar;
    }

    /* renamed from: jo */
    public boolean mo107987jo(C75880o oVar) {
        if (oVar == null) {
            return true;
        }
        C91753f fVar = this.f226919d;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(oVar.f222528b);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("");
        sb4.append(oVar.f222529c);
        return fVar.delete("oplog2", "id= ? AND inserTime= ?", new String[]{sb.toString(), sb4.toString()}) >= 0;
    }
}
