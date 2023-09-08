package p376qn;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import p227rn.C48052u;
import p227rn.C48054w;
import p248ug.C52558c;
import rb0.C47984k;
import rb0.C48009v0;

@C86522b
/* renamed from: qn.o */
public class C47873o extends C86301e implements C48054w {
    /* renamed from: Nf */
    public boolean mo72620Nf(C48052u uVar) {
        return C48009v0.Fx0().replace((C52558c) uVar);
    }

    /* renamed from: Uu */
    public boolean mo72621Uu(C48052u uVar) {
        return C48009v0.Fx0().insert((C52558c) uVar);
    }

    public List<String> cj0(int i) {
        C48009v0.Fx0().getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("select ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("username");
        sb.append(" from ");
        sb.append("rcontact");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(" where ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("specialType");
        sb.append(" = ");
        sb.append(i);
        sb.append(" and ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("username");
        sb.append(" = ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("username");
        sb.append(" and (");
        sb.append("rcontact");
        sb.append(".");
        sb.append("verifyFlag");
        sb.append(" & ");
        int i2 = C72996z1.f214113Y1;
        sb.append(8);
        sb.append(") != 0 ");
        sb.append(" and (");
        sb.append("rcontact");
        sb.append(".");
        sb.append("type");
        sb.append(" & ");
        sb.append(1);
        sb.append(") != 0 ");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getSpecialInternalBizUsernames sql %s", sb4);
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null, 2);
        int columnIndex = rawQuery.getColumnIndex("username");
        while (rawQuery.moveToNext()) {
            arrayList.add(rawQuery.getString(columnIndex));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: d0 */
    public void mo72623d0(String str) {
        C48009v0.Fx0().mo72764c(str);
    }

    public C48052u get(String str) {
        return C48009v0.Fx0().mo72757SE(str);
    }

    /* renamed from: v */
    public C48052u mo72625v(String str) {
        return C47984k.m53328b(str);
    }
}
